package com.example.low_level_design.BuilderDesingPattern.models;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }


    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineerStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setName("Vivek").setRollNo(11).setMobileNo("+917054107774").setMotherName("Reeta Devi").setFatherName("Vijay Prakash").build();
    }

    private Student createEngineerStudent() {
        return studentBuilder.setName("Ajay").setRollNo(1).setMobileNo("+919792124198").setMotherName("Anjali").setFatherName("JagJivan").build();
    }
}
