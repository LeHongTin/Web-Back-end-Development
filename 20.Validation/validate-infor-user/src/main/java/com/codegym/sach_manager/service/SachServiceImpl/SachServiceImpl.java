package com.codegym.sach_manager.service.SachServiceImpl;

import com.codegym.sach_manager.entity.Sach;
import com.codegym.sach_manager.reponsitory.SachReponsitory;
import com.codegym.sach_manager.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachServiceImpl implements SachService {
    @Autowired
    SachReponsitory sachReponsitory;

    @Override
    public List<Sach> findAll() {
        return (List<Sach>) sachReponsitory.findAll();
    }

    @Override
    public Sach findById(Long id) {
        return sachReponsitory.findById(id).orElse(null);
    }


    @Override
    public List<Sach> findAllByName() {
        return null;
    }

    @Override
    public void create(Sach sach) {
        sachReponsitory.save(sach);
    }

    @Override
    public void edit(Sach sach) {
        sachReponsitory.save(sach);
    }

    @Override
    public void delete(Sach sach) {
        sachReponsitory.delete(sach);
    }
}
