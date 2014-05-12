package com.supinfo.client.view.cli;


import com.supinfo.exception.PasswordInvalid;

public class ArgumentParser {

	private String name;
	private String password;
	private String email;
	private TestFirstArgument firstArgument;
	UserAuthentication userCheck;
	
	//CONSTRUCTOR :
	
	public ArgumentParser(String[] arguments){
		
		//if there's no argument :
		
		if(arguments.length < 1){
			System.out.println("invalid command; enter --help to open help page");
			System.out.println();
		}
		
		
	
		
		firstArgument = new TestFirstArgument(arguments);
		
		
		
		switch(firstArgument.toString()){
			
			case "--register" :
				ParseRegister registration = new ParseRegister(arguments);
				String[] temp = new String[arguments.length];
				temp = registration.value();
					
				name = temp[0];
				password = temp[1];
				email = temp[2];
			
				break;
			
			case "--help":
				//open help page
				break;
			
			case "--username":
				break;
			
			case "password":
				break;
			
			case "project":
				break;
			
			default:
				break;
		}
		
		userCheck = new UserAuthentication(name,password);
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
