package com.example.low_level_design.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employee = new EmployeeDaoProxy();
        try {
            employee.create("ADMIN", employee);
            employee.get("ADMIN");
            employee.delete("USER", employee);
        } catch (Exception e) {
            System.out.println("message: "+e.getMessage());
//            throw new RuntimeException(e);
        }
    }
}
