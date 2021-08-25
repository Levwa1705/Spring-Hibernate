package com.raimbek.spring.mvcHybernateAop.dao;

import com.raimbek.spring.mvcHybernateAop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee>getAllEmployees();
    public void saveEmployee(Employee employee);
    public  Employee getEmployeeByID(int id);
    public void deleteEmployee(int id);
}
