package com.example.low_level_design.BuilderDesingPattern.models;

import java.util.List;

abstract class StudentBuilder {
    String name;
    int rollNo;
    String mobileNo;
    String motherName;
    String fatherName;
    List<String> subjects;

    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }
    public StudentBuilder setRollNo(int rollNo){
        this.rollNo=rollNo;
        return this;
    }

    public StudentBuilder setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
        return this;
    }

    public  StudentBuilder setMotherName(String motherName){
        this.motherName=motherName;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName){
        this.fatherName=fatherName;
        return this;
    }
    public StudentBuilder setSubject(List<String> subjects){
        this.subjects=subjects;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
