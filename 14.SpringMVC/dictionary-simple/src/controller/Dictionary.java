package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DataWork;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
@GetMapping("/index")
    public String showIndex(){
    return "index";
}

@PostMapping("/translate")
    public ModelAndView Dictionary(@RequestParam("word")String word){
    ModelAndView modelAndView=new ModelAndView("index","vietnamese",DataWork.found(word));
    modelAndView.addObject("word",word);
    return modelAndView;
}

}
