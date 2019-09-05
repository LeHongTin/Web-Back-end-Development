package service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.CalculatorService;

@Service
@Transactional
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculator(double firstNumber, double secondNumber, String operator) {
        switch (operator){
            case "Addition(+)": return firstNumber + secondNumber;
            case "Subtraction(-)" : return firstNumber - secondNumber;
            case "Multiplication(x)" : return firstNumber * secondNumber;
            case "Division(:)" : return firstNumber / secondNumber;
            default:return -1;
        }

    }
}
