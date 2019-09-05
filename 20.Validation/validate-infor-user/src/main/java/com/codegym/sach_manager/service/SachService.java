package com.codegym.sach_manager.service;

import com.codegym.sach_manager.entity.Sach;
import java.util.List;

public interface SachService {
    List<Sach> findAll();
    Sach findById(Long id);
    List<Sach> findAllByName();
    void create(Sach sach);
    void edit(Sach sach);
    void delete(Sach sach);
}
