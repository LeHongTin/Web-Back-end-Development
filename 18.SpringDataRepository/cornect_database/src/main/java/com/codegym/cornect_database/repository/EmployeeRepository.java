package com.codegym.cornect_database.repository;

import com.codegym.cornect_database.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
