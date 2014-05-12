package com.supinfo.client.view.cli;


import com.supinfo.exception.PasswordInvalid;

public class ArgumentParser {

	private String name;
	private String password;
	private String email;
	UserAuthentication userCheck;
	
	//constructor
	public ArgumentParser(String[] arguments){
	
		for(int i = 0 ; i < arguments.length; i++){
			
			switch(i){
				case 0 :
					if(arguments[i].equals("--register") && (!(arguments[i+1] == null || arguments[i+2] == null || arguments[i+3]== null))){
						name = arguments[i+1];
						password = arguments[i+2];
						email = arguments[i+3];
					}
					else if (arguments[i].equals("--help") && arguments[i+1]== null && arguments[i+2] == null && arguments[1+3] == null){
						//open help page
					}
					
					else if(arguments[i].equals("gui") && arguments[i+1]== null && arguments[i+2] == null && arguments[1+3] == null){
						//launch GUI
					}
					
					else if (arguments[i] != null){
						name = arguments[i];
					}
					
					else{
						System.out.println(" Incorrect arguments ; enter --help to open help page");
					}
					break;
				
				case 1:
					break;
				
				case 2:
					break;
				
				case 3:
					break;
				
				default:
					break;
			}
			if(arguments[3].equals("test")){
				name = arguments[0];
				password = arguments[1];
				
				 
				 userCheck = new UserAuthentication(name, password);
				 
			}
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
