package com.example.service;

import com.example.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private  static Map<Integer, Student> students;

    static {

        students = new HashMap<>();
        students.put(1, new Student(1, "Tin", "tin@codegym.vn", "DaNang"));
        students.put(2, new Student(2, "Hai", "hai@codegym.vn", "DaNang"));
        students.put(3, new Student(3, "Long", "long@codegym.vn", "Hue"));
        students.put(4, new Student(4, "Nhat", "nhat@codegym.vn", "Hue"));
        students.put(5, new Student(5, "Minh", "minh@codegym.vn", "DaNang"));
        students.put(6, new Student(6, "Nam", "nam@codegym.vn", "DaNang"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public void update(int id, Student student) {
        students.put(id, student);
    }

    @Override
    public void delete(int id) {
        students.remove(id);
    }
}
