package com.supinfo.controler.validator;

import com.supinfo.client.model.Login;
import com.supinfo.exception.PasswordHaveNotLowercase;
import com.supinfo.exception.PasswordHaveNotNumber;
import com.supinfo.exception.PasswordHaveNotUppercase;
import com.supinfo.exception.PasswordInvalid;
import com.supinfo.exception.PasswordTooShort;

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
		
		for(int i=0;i != password.length(); i++){
			charTest = password.charAt(i);
			switch (charTest) {
			case '1': numberCounter++;
					break;
			case '2': numberCounter++;
					break;
			case '3': numberCounter++;
					break;
			case '4': numberCounter++;
					break;
			case '5': numberCounter++;
					break;
			case '6': numberCounter++;
					break;
			case '7': numberCounter++;
					break;
			case '8': numberCounter++;
					break;
			case '9': numberCounter++;
					break;
			case '0': numberCounter++;
					break;
			default: break;			
			}
			
			if(numberCounter > 0){
				break;
			}
		}
		
		if(numberCounter > 0){
			return;
		} else {
			throw new PasswordHaveNotNumber();
		}
	}
	
	public void checkPasswordUppercase() throws PasswordHaveNotUppercase {		
		
		if(checkPasswordLoop(password.toUpperCase())){
			return;
		} else {
			throw new PasswordHaveNotUppercase();
		}
	}
	
	public void checkPasswordLowercase() throws PasswordHaveNotLowercase {
		
		if(checkPasswordLoop(password.toLowerCase())){
			return;
		} else {
			throw new PasswordHaveNotLowercase();
		}
		
	}
	
	private boolean checkPasswordLoop(String passwordTestTemp) {
		int charCounter = 0;
		
		for(int i=0;i <= password.length()-1; i++){
			if(password.charAt(i) == passwordTestTemp.charAt(i)){
				charCounter ++;
			}
			
			if(charCounter > 0){
				return true;
			}
		}
		
		return false;
		
	}
	
	public void checkPassword() throws PasswordInvalid { //This method use chained exception to handle wrong password and throw up the more general PasswordInvalid
		try{
			this.checkPasswordSize();
			this.checkPasswordNumber();
			this.checkPasswordUppercase();
			this.checkPasswordLowercase();
		} catch (PasswordTooShort a) {
			throw new PasswordInvalid("PasswordTooShort",a);
		} catch (PasswordHaveNotNumber b) {
			throw new PasswordInvalid("PasswordHaveNotNumber", b) ;
		} catch (PasswordHaveNotUppercase c){
			throw new PasswordInvalid("PasswordHaveNotUppercase", c);
		} catch (PasswordHaveNotLowercase d){
			throw new PasswordInvalid("PasswordHaveNotLowercase", d);
		} finally {
			//Still searching what to put here.
			// TODO Fill the Finally block.
		}
	}
	
	

}
