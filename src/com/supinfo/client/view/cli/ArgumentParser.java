package com.supinfo.client.view.cli;

import java.util.ArrayList;
import java.util.List;

public class ArgumentParser {

	private String name;
	private String password;
	private String email;
	UserAuthentication userCheck;
	
	//constructor
	public ArgumentParser(List <String> arguments, List <String> Gui){
		
	 name = arguments.get(0);
	 password = arguments.get(1);
	 
	 
	  userCheck = new UserAuthentication(name, password);
	}
	
	//Methods :
	
	public void checkRegistration(){
		
		userCheck.checkPasswordNumber();
	}
}
