package com.codegym.cornect_database.validator.vadidatorEmail;

import com.codegym.cornect_database.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueCustomerEmailValidator implements ConstraintValidator<UniqueCustomerEmail,String> {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(customerRepository==null){
            return true;
        }
        return customerRepository.countByEmail(s)<1;
    }
}
