package com.codegym.sach_manager.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="Sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String ten;
    @NotNull
    private int namxb;
    @NotEmpty
    private String tloai;
    @NotEmpty
    private String tgia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    public String getTloai() {
        return tloai;
    }

    public void setTloai(String tloai) {
        this.tloai = tloai;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }
}