package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/index")
    private String showIndex(){
        return "index";
    }

    @RequestMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment){
        ModelAndView modelAndView;
        if(condiment != null){
            modelAndView = new ModelAndView("index", "condiment", condiment);
            return modelAndView;
        }
        return new ModelAndView("index");
    }
}
