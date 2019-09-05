package com.codegym.cornect_database.controller;

import com.codegym.cornect_database.entity.Customer;
import com.codegym.cornect_database.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public ModelAndView listCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customerService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCus(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirect) {
        if (bindingResult.hasErrors()) {
            return "/customer/create";
        }
        redirect.addFlashAttribute("message", "Create Successfully!");
        customerService.create(customer);
        return "redirect:/customers/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        customerService.update(customer);
        redirectAttributes.addFlashAttribute("message", "Update Successfully!");
        return "redirect:/customers/list";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView ShowInfor(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        customerService.remove(customer);
        redirectAttributes.addFlashAttribute("message", "Delete Successfully!");
        return "redirect:/customers/list";
    }

    @PostMapping("/find")
    public ModelAndView findCustomer(@ModelAttribute("search") String s, RedirectAttributes redirectAttributes) {
        if (customerService.findByName(s).isEmpty()) {
            ModelAndView modelAndView = new ModelAndView("customer/list");
            modelAndView.addObject("customers", customerService.findAll());
            modelAndView.addObject("message" ,"Name not found");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("customer/list");
            modelAndView.addObject("customers", customerService.findByName(s));
            return modelAndView;
        }
    }

}