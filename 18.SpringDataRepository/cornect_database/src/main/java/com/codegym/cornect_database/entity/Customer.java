package com.codegym.cornect_database.entity;

import com.codegym.cornect_database.validator.vadidatorEmail.UniqueCustomerEmail;
import com.codegym.cornect_database.validator.vadidatorName.UniqueCustomerName;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Name is not null")
    @UniqueCustomerName
    private String name;

    @Min(value = 18, message = "under 18 years ")
    @NotNull(message = "age is not null")
    private int age;

    @Email(message = "email is not valid")
    @NotEmpty(message = "Email is not null")
    @UniqueCustomerEmail
    private String email;

    private String address;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
