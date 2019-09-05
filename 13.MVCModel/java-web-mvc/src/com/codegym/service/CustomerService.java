package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(int Id, Customer customer);
    Customer findById(int Id);
    void update(int Id, Customer customer);
    void remove(int Id);
}
