package com.example.low_level_design.ProxyDesignPattern;

public class EmployeeDaoImp implements EmployeeDao{
    @Override
    public void create(String user, EmployeeDao employeeDao) {
        System.out.println("Employee Created");
    }

    @Override
    public void delete(String user, EmployeeDao employeeDao) {
        System.out.println("Employee Deleted");
    }

    @Override
    public EmployeeDao get(String user) {
        System.out.println("Get Employee");
        return null;
    }
}
