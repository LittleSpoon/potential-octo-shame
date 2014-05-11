package com.supinfo.controler.validator;

import com.supinfo.controler.validator.org.apache.commons.validator.routines.EmailValidator;
import com.supinfo.exception.InvalidEMail;


public class RegisterCheck extends LoginCheckPassword {

	public RegisterCheck() {
		// TODO Auto-generated constructor stub
	}

	public RegisterCheck(String loginId, String loginPW, String loginEMail) {
		super(loginId, loginPW);
		this.eMail = loginEMail;
	}
	
	public void eMailCheck() throws InvalidEMail {
		
		EmailValidator emailValidator = EmailValidator.getInstance();
		if(emailValidator.isValid(eMail)){
			return;
		} else {
			throw new InvalidEMail();
		}
		
	}
}
