package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    private static final List<Customer> listCustomer = new ArrayList<>();

    static {
        Customer customer0 = new Customer("Hai", "Da Nang","1/1/1998");
        Customer customer1 = new Customer("Kien","Hue","1/1/1998");
        Customer customer2 = new Customer("Long", "Hue", "1/1/1995");

        listCustomer.add(customer0);
        listCustomer.add(customer1);
        listCustomer.add(customer2);
    }

    public static List<Customer> getListCustomer() {
        return listCustomer;
    }

}
