package com.codegym.cornect_database.controller;

import com.codegym.cornect_database.entity.Employee;
import com.codegym.cornect_database.service.EmployeeService;
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
    private EmployeeService employService;

    @GetMapping("/list")
    public ModelAndView listCustomer() {
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
    public String createCus(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirect) {
        if (bindingResult.hasErrors()) {
            return "/employee/create";
        }
        redirect.addFlashAttribute("message", "Create Successfully!");
        employService.create(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        Employee customer = employService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employee/edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("customer") Employee customer, RedirectAttributes redirectAttributes) {
        employService.update(customer);
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

}
