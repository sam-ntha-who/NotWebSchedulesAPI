package com.notwebschedules.NotWebSchedulesAPI.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.notwebschedules.NotWebSchedulesAPI.exceptions.PhoneNumberNotValidException;

public class PhoneNumberValidator {

	private String digits;
	private boolean valid;
	
	public PhoneNumberValidator() {
		
	}
	
	public PhoneNumberValidator(String digits) {
		if (isValid(digits)) {
			this.digits = digits;
		} 
		
		throw new PhoneNumberNotValidException(digits);
	}
	
	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}

	public boolean isValid(String digits) {
		if (digits.isEmpty()) {
			return false;
		}
		
		String regex = "\\d{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(digits);
		
		return matcher.find();
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
