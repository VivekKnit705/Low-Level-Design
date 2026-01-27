package com.example.low_level_design.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImp();
    }

    @Override
    public void create(String user, EmployeeDao employeeDao) throws Exception {
        if(user.equals("ADMIN")){
            this.employeeDao.create(user, employeeDao);
            return;
        }
        throw new Exception("Only ADMIN can create employee");
    }

    @Override
    public void delete(String user, EmployeeDao employeeDao)  throws Exception{
        if(user.equals("ADMIN")){
            this.employeeDao.delete(user, employeeDao);
            return;
        }
        throw new Exception("Only ADMIN can delete employee");

    }

    @Override
    public EmployeeDao get(String user) throws Exception{
        if (user.equals("ADMIN")) {
            return this.employeeDao.get(user);
        }
        throw new Exception("Only ADMIN can get employee");

    }
}
