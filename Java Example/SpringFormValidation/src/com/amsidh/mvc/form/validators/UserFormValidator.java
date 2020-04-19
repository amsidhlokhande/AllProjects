package com.amsidh.mvc.form.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.amsidh.mvc.domain.User;

public class UserFormValidator implements Validator{

	@Override
	public boolean supports(Class<?> paramClass) {
		return paramClass.equals(User.class);
		
	}

	@Override
	public void validate(Object obj, Errors errors) {
		User user=(User)obj;
		try {
			ValidationUtils.rejectIfEmpty(errors, user.getClass().getField("userId").getName(), "User ID must be required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, user.getClass().getField("userName").getName(), "User Name must be required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, user.getClass().getField("mobileNumber").getName(), "Mobile Number must be required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, user.getClass().getField("userDob").getName(), "Date of birth must be required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, user.getClass().getField("emailId").getName(), "EmailID must be required");
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
	}

}
