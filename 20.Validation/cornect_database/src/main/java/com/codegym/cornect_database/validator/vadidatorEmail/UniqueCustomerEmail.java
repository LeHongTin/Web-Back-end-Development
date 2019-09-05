package com.codegym.cornect_database.validator.vadidatorEmail;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueCustomerEmailValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCustomerEmail {
    String message() default "This email already exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
