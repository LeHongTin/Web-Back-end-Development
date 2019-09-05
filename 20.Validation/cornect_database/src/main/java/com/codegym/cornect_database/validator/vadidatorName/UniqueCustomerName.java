package com.codegym.cornect_database.validator.vadidatorName;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueCustomerNameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCustomerName {
    String message() default "This customer already exists";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
