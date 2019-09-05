package com.codegym.employeesmanager.service;

import com.codegym.employeesmanager.entity.Employee;
import com.codegym.employeesmanager.reponsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByName(String name) {
        return (List<Employee>) employeeRepository.findAllByNameContaining(name);
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
