package com.codegym.cornect_database.service;


import com.codegym.cornect_database.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    List<Customer> findByName(String name);
    void update(Customer customer);
    void remove(Customer customer);
    void create(Customer customer);
}

