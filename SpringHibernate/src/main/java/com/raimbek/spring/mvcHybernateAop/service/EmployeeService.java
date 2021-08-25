package com.raimbek.spring.mvcHybernateAop.service;

import com.raimbek.spring.mvcHybernateAop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveService(Employee employee);
    public Employee getEmployeeByID(int id);
    public void deleteEmployee(int id);
}
