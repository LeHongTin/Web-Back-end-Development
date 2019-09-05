package com.codegym.employeesmanager.entity;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message = "nhom khong duoc de trong")
    private String group;

    @NotEmpty(message = "ten khong duoc de trong")
    private String name;

    @NotEmpty(message = "gioi tinh khong duoc de trong")
    private String sex;

    @NotEmpty(message = "sdt khong duoc de trong")
    @Pattern(regexp="(^$|[0-9]{10})",message = "sdt k dung")
    private String phoneNumber;

    @NotEmpty(message = "ngay sinh khong duoc de trong")
    private String birthday;

    @Column(name = "so_cmnd")
    @NotEmpty(message = "So CMND khong duoc de trong")
    private String soCMND;

    @NotEmpty(message = "email khong duoc de trong")
    @Email(message = "email is not valid")
    private String email;

    @NotEmpty(message = "dia chi khong duoc de trong")
    private String address;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
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
