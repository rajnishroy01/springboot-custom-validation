package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<ValidScore,String> {

    List<String> validScores = Arrays.asList("a","a+","a-","b","b+","b-","c","c+","c-");

    public boolean isValid(String value, ConstraintValidatorContext context) {
     
        for(String str:validScores)
        {
            if(str.equals(value))
                return true;
        }
        return false;
    }
}
