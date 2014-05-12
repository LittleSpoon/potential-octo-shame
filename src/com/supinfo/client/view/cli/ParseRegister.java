package com.supinfo.client.view.cli;

public class ParseRegister {
	
	String name;
	String password;
	String email;
	
	//CONSTRUCTOR :
	
	
	public ParseRegister(String[] arguments){
		
		name = null;
		password = null;
		email = null;
		
		if(arguments.length < 7){
			
			System.out.println("not enough arguments");
		}
		
		for (int i = 0; i < arguments.length - 1;i++){
				
				switch (arguments[i+1]){
				
					case "--username":
						if(arguments[i+2]!= null && name == null){
							name = arguments[i+2];
						}
						break;
					
					case "--password":
						if(arguments[i+2]!= null && password == null){
							password = arguments[i+2];
						}
						break;
					
					case "--email":
						if(arguments[i+2]!= null && email == null){
							email = arguments[i+2];
						}
						break;
					
					default :
						break;
				}
			
		}
	}
	
	public String[] value(){
		
		String[] fieldValue = new String[3];
		
		fieldValue[0] = name;
		fieldValue[1] = password;
		fieldValue[2] = email;
		
		
		return fieldValue;
	}
	
}
