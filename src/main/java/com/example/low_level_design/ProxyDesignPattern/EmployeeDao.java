package com.example.low_level_design.ProxyDesignPattern;

public interface EmployeeDao {

    void create(String user, EmployeeDao employeeDao) throws Exception;
    void delete(String user, EmployeeDao employeeDao) throws Exception;
    EmployeeDao get( String user) throws Exception;
}
