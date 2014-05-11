package com.supinfo.client.view.cli;


import com.supinfo.exception.PasswordInvalid;

public class ArgumentParser {

	private String name;
	private String password;
	private String email;
	UserAuthentication userCheck;
	
	//constructor
	public ArgumentParser(String[] arguments){
	
		if(arguments[3].equals("test")){
			name = arguments[0];
			password = arguments[1];
			 
			 
			 userCheck = new UserAuthentication(name, password);
			 
		}
	 
	}
	
	//Methods :
	
	public void checkRegistration(){
		
		try {
			userCheck.checkPassword();
		} catch (PasswordInvalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
