package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override 
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	// you can do whatever you want in that isValid method, many checks everywhere
	@Override
	public boolean isValid(String code, ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result;
		
		if(code != null) { 
			result = code.startsWith(coursePrefix);
		} else { 
			result = true;
		}
		
		return result;
	}

	
	
}
