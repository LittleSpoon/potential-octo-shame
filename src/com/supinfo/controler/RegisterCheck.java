package com.supinfo.controler;

public class RegisterCheck extends LoginCheckSize {

	public RegisterCheck() {
		// TODO Auto-generated constructor stub
	}

	public RegisterCheck(String loginId, String loginPW, String loginEMail) {
		super(loginId, loginPW);
		this.eMail = loginEMail;
	}
	
	
}
