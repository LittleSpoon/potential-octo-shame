package com.supinfo.client.view.cli;

public class ParserAuthentication {
	
	String[] temp;
	
	
	//CONSTRUCTOR :
	
	public ParserAuthentication(String[] arguments){
		
		temp = new String[3];
		for(int i = 0; i < 3 ; i++){
			temp[i] = null;
		}
		
		if (arguments.length < 4){
			
			System.out.println("invalid use of command ; enter --help to open help page");
		}
		
		else{
			
			for(int i =0; i < arguments.length -1; i++){
				
				switch(arguments[i]){
					
					case "--username":
						if(arguments[i+1] != null){
							temp[0] = arguments[i+1];
						}
						
						break;
					
					case "--password":
						if(arguments[i+1] != null){
							temp[1] = arguments[i+1];
						}
						break;
					
					case "--project":
						if(arguments[i+1] != null){
							temp[2] = arguments[i+1];
						}
						break;
					
				}
			}
		}
		
	}
	
	
	//METHODS :
	public String[] authenticationValue(){
		
		
		return temp;
	}

}
