package com.codegym.employeesmanager.reponsitory;

import com.codegym.employeesmanager.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    Iterable<Employee> findAllByNameContaining(String name);
}
