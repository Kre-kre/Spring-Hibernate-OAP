package com.hibernate.spring.dao;

import com.hibernate.spring.entity.Employee;
import 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.SessionFactoryUtils;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

  private   SessionFactory

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory
        return null;
    }
}
