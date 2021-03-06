package com.codegym.employeesmanager.controller;

import com.codegym.employeesmanager.entity.Employee;
import com.codegym.employeesmanager.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployService employService;

    @GetMapping("/list")
    public ModelAndView listEmployee() {
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employees", employService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createEmp(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirect) {
        if (bindingResult.hasErrors()) {
            return "/employee/create";
        }
        redirect.addFlashAttribute("message", "Create Successfully!");
        employService.create(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        Employee employee = employService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employee/edit");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        employService.update(employee);
        redirectAttributes.addFlashAttribute("message", "Update Successfully!");
        return "redirect:/employees/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView ShowInfor(@PathVariable Long id) {
        Employee employee = employService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employee/delete");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        employService.remove(employee);
        redirectAttributes.addFlashAttribute("message", "Delete Successfully!");
        return "redirect:/employees/list";
    }

    @PostMapping("/find")
    public ModelAndView findCustomer(@ModelAttribute("search") String s, RedirectAttributes redirectAttributes) {
        if (employService.findByName(s).isEmpty()) {
            ModelAndView modelAndView = new ModelAndView("employee/list");
            modelAndView.addObject("employees", employService.findAll());
            modelAndView.addObject("message" ,"Name not found");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("employee/list");
            modelAndView.addObject("employees", employService.findByName(s));
            return modelAndView;
        }
    }

}
