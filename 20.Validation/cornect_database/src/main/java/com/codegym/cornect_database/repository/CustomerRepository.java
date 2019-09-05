package com.codegym.cornect_database.repository;

import com.codegym.cornect_database.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Iterable<Customer> findAllByNameContaining(String name);
    Long countByName(String s);
    Long countByEmail(String s);
}
