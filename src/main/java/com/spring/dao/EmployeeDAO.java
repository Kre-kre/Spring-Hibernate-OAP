package com.spring.dao;

import com.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees(); //Sort!

   public void saveEmployee(Employee employee);

  public Employee getEmployee(Long id);

  public void deleteEmployee(Long id);
}
