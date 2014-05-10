package com.supinfo.controler;

import com.supinfo.client.model.Login;
import com.supinfo.excpetion.StringTooLong;

public class LoginCheckSize extends Login {

	public LoginCheckSize() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginCheckSize(String loginId, String loginPW){
		this.username = loginId;
		this.password = loginPW;
		this.eMail = null;
	}
	
	public void setPassword(String loginPW){
		this.password = loginPW;
	}
	
	public void checkPasswordSize() throws StringTooLong {
		if (password.length() > 8){
			throw new StringTooLong();
		}
			
	}		

}
