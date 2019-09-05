package com.codegym.cornect_database.service;

import com.codegym.cornect_database.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    void update(Employee employee);
    void remove(Employee employee);
    void create(Employee employee);
}
