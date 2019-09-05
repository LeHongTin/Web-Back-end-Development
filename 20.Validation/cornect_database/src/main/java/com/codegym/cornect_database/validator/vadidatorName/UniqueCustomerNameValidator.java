package com.codegym.cornect_database.validator.vadidatorName;

import com.codegym.cornect_database.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueCustomerNameValidator implements ConstraintValidator<UniqueCustomerName,String> {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(customerRepository==null){
            return true;
        }
        return customerRepository.countByName(s)<1;
    }
}
