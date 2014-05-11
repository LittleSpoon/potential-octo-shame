package com.supinfo.client.view.cli;

import java.util.Scanner;

import com.supinfo.controler.LoginCheckPassword;
import com.supinfo.exception.PasswordInvalid;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginCheckPassword test =  new LoginCheckPassword("testusername",null);
		
		Scanner cliEntry = new Scanner(System.in);
		System.out.println("A password of 8 character");		
		test.setPassword(cliEntry.nextLine());		
		
		try {
			test.checkPassword();
		} catch (PasswordInvalid e){
			System.out.println(e.getCause().toString());
		} finally {
			System.out.println("Finally block");
		}
		
		cliEntry.close();
		
	}

}
