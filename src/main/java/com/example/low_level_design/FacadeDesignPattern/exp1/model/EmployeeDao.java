package com.example.low_level_design.FacadeDesignPattern.exp1.model;

public class EmployeeDao {

    public String getEmpName(int empId){
        return "";
    }

    public void updateEmpDetails(int empId){

    }

    public EmployeeDao getEmployee(int empId){
        return new EmployeeDao();
    }
    public EmployeeDao getEmployee(String emailId){
        return new EmployeeDao();
    }

    public void updateName(){

    }

}
