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
			
			if(i == 0){
				
				if(arguments[i].equals("--register")){
					
					
					switch(arguments[i+1]){
					
						case "--username" :
							if(arguments[i+2] != null ){
								name = arguments[i+2];
							}
							break;
							
						case "--password" :
							if(arguments[i+2] != null){
								password = arguments[i+2];
							}
							break;
						
						case "--email" :
							if(arguments[i+2] != null){
								email = arguments[i+2];
							}
							break;
					}
					
					
					switch(arguments[i+3]){
						
						case "--username" :
							if(arguments[i+4] != null ){
								name = arguments[i+4];
							}
							break;
						
						case "--password" :
							if(arguments[i+4] != null ){
								password = arguments[i+4];
							}
							break;
					
						case "--email" :
							if(arguments[i+4] != null ){
								email = arguments[i+4];
							}
							break;
					}
					
					
					
					switch (arguments[i+5]){
						case "--username" :
							if(arguments[i+6] != null ){
								name = arguments[i+4];
							}
							break;
						
						case "--password" :
							if(arguments[i+6] != null ){
								password = arguments[i+4];
							}
							break;
					
						case "--email" :
							if(arguments[i+6] != null ){
								email = arguments[i+4];
							}
							break;
					}
				}
				
			}
			/*if(arguments[3].equals("test")){
				name = arguments[0];
				password = arguments[1];
				
				 
				 userCheck = new UserAuthentication(name, password);
				 
			}*/
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
