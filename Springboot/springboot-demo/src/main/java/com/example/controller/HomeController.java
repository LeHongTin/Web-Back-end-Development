package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    private StudentService studentService = new StudentServiceImpl();

    @GetMapping("/view")
    public String index(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "index";
    }

    @GetMapping("/student/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/student/save")
    public String save(Student student, RedirectAttributes redirect) {
        student.setId((int)(Math.random() * 10000));
        studentService.save(student);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/view";
    }


}
