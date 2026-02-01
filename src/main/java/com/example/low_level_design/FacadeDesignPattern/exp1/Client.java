package com.example.low_level_design.FacadeDesignPattern.exp1;

public class Client {

    EmployeeFacade employeeFacade;

    public Client(){
        employeeFacade=new EmployeeFacade();
    }

    public void create(){
        employeeFacade.getEmployee("vivek@122");
        employeeFacade.getEmpName(12);
    }


}
