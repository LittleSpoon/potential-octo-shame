package com.supinfo.controler;

import com.supinfo.client.model.Login;
import com.supinfo.excpetion.PasswordHaveNotNumber;
import com.supinfo.excpetion.PasswordHaveNotUppercase;
import com.supinfo.excpetion.PasswordInvalid;
import com.supinfo.excpetion.PasswordTooShort;

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
	
	public void checkPasswordSize() throws PasswordTooShort {
		
		if (password.length() < 8){
			throw new PasswordTooShort();
		}
			
	}
	
	public void checkPasswordNumber() throws PasswordHaveNotNumber {
		char charTest;
		int numberCounter = 0;
		
		for(int i=0;i == password.length(); i++){
			charTest = password.charAt(i);
			switch (charTest) {
			case 1: numberCounter++;
					break;
			case 2: numberCounter++;
					break;
			case 3: numberCounter++;
					break;
			case 4: numberCounter++;
					break;
			case 5: numberCounter++;
					break;
			case 6: numberCounter++;
					break;
			case 7: numberCounter++;
					break;
			case 8: numberCounter++;
					break;
			case 9: numberCounter++;
					break;
			case 0: numberCounter++;
			default: break;			
			}
			
			if(numberCounter > 0){
				break;
			}
		}
		
		if(numberCounter < 0){
			return;
		} else {
			throw new PasswordHaveNotNumber();
		}
	}
	
	public void checkPasswordUppercase() throws PasswordHaveNotUppercase {
		
	}
	
	

}
