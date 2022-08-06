package com.spring.service;

import com.spring.dao.EmployeeDAO;
import com.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public List<Employee> getAllEmployee() {

        return employeeDAO.getAllEmployees();

    }

    @Transactional
    public void saveEmployee(Employee employee) {

        employeeDAO.saveEmployee(employee);
    }

    @Transactional
    public Employee getEmployee(Long id) {
        return employeeDAO.getEmployee(id);
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeDAO.deleteEmployee(id);

    }


}
