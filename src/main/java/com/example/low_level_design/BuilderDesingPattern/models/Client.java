package com.example.low_level_design.BuilderDesingPattern.models;

public class Client {
    public static void main(String[] args){
        StudentBuilder enggStudent=new EngineeringStudentBuilder();
        Director director=new Director(enggStudent);
        Student student1=director.createStudent();
        System.out.println(student1.toString());


        StudentBuilder mbsStudent=new MBAStudentBuilder();
        director=new Director(mbsStudent);
        Student student2=director.createStudent();
        System.out.println(student2.toString());
    }
}
