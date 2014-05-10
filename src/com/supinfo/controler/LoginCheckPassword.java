package com.supinfo.controler;

import com.supinfo.client.model.Login;
import com.supinfo.excpetion.PasswordInvalid;

public class LoginCheckPassword extends Login {

	public LoginCheckPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginCheckPassword(String loginId, String loginPW){
		this.username = loginId;
		this.password = loginPW;
		this.eMail = null;
	}
	
	public void setPassword(String loginPW){
		this.password = loginPW;
	}
	
	public void checkPasswordSize() throws PasswordInvalid {
		if (password.length() < 8){
			throw new PasswordInvalid();
		}
			
	}		
	
	

}
