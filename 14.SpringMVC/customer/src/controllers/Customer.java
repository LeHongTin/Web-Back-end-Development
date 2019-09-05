package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Customer {
    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }
}
