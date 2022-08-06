package com.hibernate.spring.dao;

import com.hibernate.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
