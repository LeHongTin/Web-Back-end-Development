package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers;
    static {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Tin","tin@codegym.vn","DaNang"));
        customers.add(new Customer(2,"Hai","hai@codegym.vn","QuangNam"));
        customers.add(new Customer(3,"Thanh","thanh@codegym.vn","DaNang"));
        customers.add(new Customer(4,"Nhat","nhat@codegym.vn","DaNang"));
        customers.add(new Customer(5,"Vui","vui@codegym.vn","DaNang"));
        customers.add(new Customer(6,"Phi","phi@codegym.vn","DaNang"));
        customers.add(new Customer(7,"Anh","anh@codegym.vn","Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(int Id, Customer customer) {

    }

    @Override
    public Customer findById(int Id) {
        return null;
    }

    @Override
    public void update(int Id, Customer customer) {

    }

    @Override
    public void remove(int Id) {

    }
}
