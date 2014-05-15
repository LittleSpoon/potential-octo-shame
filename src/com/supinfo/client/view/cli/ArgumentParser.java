package com.supinfo.client.view.cli;


import com.supinfo.exception.PasswordInvalid;
import com.supinfo.controler.connection.LoginConnect;
public class ArgumentParser {

	private String userName;
	private String password;
	private String email;
	private String project;
	private TestFirstArgument firstArgument;
	UserAuthentication userCheck;
	
	//CONSTRUCTOR :
	
	public ArgumentParser(String[] arguments){
		
		//if there's no argument :
		
		if(arguments.length < 1){
			System.out.println("invalid command; enter --help to open help page");
			System.out.println();
		}
		
		
	
		//Testing of the first argument :
		firstArgument = new TestFirstArgument(arguments);
		
		
		
		switch(firstArgument.toString()){
			
		//if the first argument is --register :
			case "--register" :
				ParseRegister registration = new ParseRegister(arguments);
				String[] temp = new String[arguments.length];
				temp = registration.value();
					
				userName = temp[0];
				password = temp[1];
				email = temp[2];
			
				break;
			
			//if the first argument is --help :
			case "--help":
				//open help page
				break;
			
			case "--Gui" :
				//Launch GUI
				break;
			
			default:
				ParserAuthentication authentication = new ParserAuthentication(arguments);
				String[] tempAuthentication = new String[arguments.length];
				
				tempAuthentication = authentication.authenticationValue();
				userName = tempAuthentication[0];
				password = tempAuthentication[1];
				project = tempAuthentication[2];
				break;
		}
		
		
		//
		userCheck = new UserAuthentication(userName,password);
		LoginConnect connection = new LoginConnect(userName,password);
	}
	
	//METHODS :
	
	public void checkRegistration(){
		
		try {
			userCheck.checkPassword();
		} catch (PasswordInvalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
