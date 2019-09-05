package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

@Controller
public class CalculatorController {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @GetMapping("/home")
    private String showIndex() {
        return "index";
    }

    @PostMapping("/calculator")
    private ModelAndView calculator(@RequestParam("operator") String operator, @RequestParam("firstNumber") double firstNumber, @RequestParam("secondNumber") double secondNumber) {
        double result = calculatorService.calculator(firstNumber, secondNumber, operator);
        ModelAndView modelAndView = new ModelAndView("index", "result", result);
        modelAndView.addObject("operator",operator);
        return modelAndView;
    }
}
