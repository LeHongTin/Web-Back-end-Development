package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class calculative {
@GetMapping("/index")
    public ModelAndView showIndex(){
    double vnd = 0;
    return new ModelAndView("index","vnd",vnd);
}
@PostMapping("/translate")
    public ModelAndView translate(@RequestParam("usd")double usd, @RequestParam("rate")double rate){
    double vnd = rate * usd;
    ModelAndView modelAndView=new ModelAndView("index","vnd", String.format("%.0f", vnd));
    modelAndView.addObject("usd",usd);
    return modelAndView;
}
}
