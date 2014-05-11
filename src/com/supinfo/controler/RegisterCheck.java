package com.supinfo.controler;

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
		
		
	}
}
