package com.example.low_level_design.FacadeDesignPattern.exp1;

import com.example.low_level_design.FacadeDesignPattern.exp1.model.EmployeeDao;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeFacade(){
        employeeDao=new EmployeeDao();
    }

    public String getEmpName(int empId){
        return employeeDao.getEmpName(empId);
    }

    public EmployeeDao getEmployee(String emailId){
        return employeeDao.getEmployee(emailId);
    }
}
