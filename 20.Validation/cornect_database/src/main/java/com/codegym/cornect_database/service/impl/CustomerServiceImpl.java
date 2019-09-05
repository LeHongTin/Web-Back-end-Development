package com.codegym.cornect_database.service.impl;

import com.codegym.cornect_database.entity.Customer;
import com.codegym.cornect_database.repository.CustomerRepository;
import com.codegym.cornect_database.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findByName(String name) {
        return (List<Customer>) customerRepository.findAllByNameContaining(name);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }


}
