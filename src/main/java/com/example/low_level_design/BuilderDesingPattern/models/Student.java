package com.example.low_level_design.BuilderDesingPattern.models;

import java.util.List;

public class Student {
    private String name;
    private int rollNo;
    private String mobileNo;
    private String motherName;
    private String fatherName;
    private List<String> subjects;


    public Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.rollNo=studentBuilder.rollNo;
        this.mobileNo= studentBuilder.mobileNo;
        this.motherName= studentBuilder.motherName;
        this.fatherName= studentBuilder.fatherName;
        this.subjects=studentBuilder.subjects;

    }

    public String toString(){
        return "Name is: "+this.name+" rollNo is: "+this.rollNo+" mobileNo is: "+this.mobileNo+" Mother Name is: "+this.motherName+" Father Name is: "+this.fatherName;
    }

}
