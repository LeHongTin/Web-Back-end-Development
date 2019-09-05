package com.codegym.sach_manager.controller;

import com.codegym.sach_manager.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sachs")
public class SachController {
    @Autowired
    private SachService sachService;

    @GetMapping("/home")
    public ModelAndView showhome() {
        ModelAndView modelAndView = new ModelAndView("sach/home");
        modelAndView.addObject("sachs", sachService.findAll());
        return modelAndView;
    }
}