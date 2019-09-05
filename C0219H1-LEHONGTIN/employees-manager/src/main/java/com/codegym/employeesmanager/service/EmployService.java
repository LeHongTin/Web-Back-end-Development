package com.codegym.employeesmanager.service;

import com.codegym.employeesmanager.entity.Employee;

import java.util.List;

public interface EmployService {
        List<Employee> findAll();
        List<Employee> findByName(String name);
        Employee findById(Long id);
        void create(Employee employee);
        void update(Employee employee);
        void remove(Employee employee);
}
