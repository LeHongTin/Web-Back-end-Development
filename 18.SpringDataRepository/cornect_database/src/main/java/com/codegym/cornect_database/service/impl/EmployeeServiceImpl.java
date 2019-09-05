package com.codegym.cornect_database.service.impl;

import com.codegym.cornect_database.entity.Employee;
import com.codegym.cornect_database.repository.EmployeeRepository;
import com.codegym.cornect_database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }


    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }
}

