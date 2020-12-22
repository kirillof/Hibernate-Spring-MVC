package com.kirillkirillov.spring.mvc_hibernate_AOP.service;

import com.kirillkirillov.spring.mvc_hibernate_AOP.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
