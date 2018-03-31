package com.example.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<TestConstraint, Object> {
    @Override
    public void initialize(TestConstraint constraintAnnotation) {
        System.out.println("my validator");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("valid");
        return false;
    }
}
