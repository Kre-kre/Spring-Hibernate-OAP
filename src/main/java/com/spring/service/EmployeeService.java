package com.spring.service;
import com.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public void deleteEmployee(Long id);
}
