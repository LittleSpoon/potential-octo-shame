package com.supinfo.client.view.cli;

import java.util.Scanner;

import com.supinfo.controler.LoginCheckSize;
import com.supinfo.excpetion.StringTooLong;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginCheckSize test =  new LoginCheckSize("testusername",null);
		
		Scanner cliEntry = new Scanner(System.in);
		System.out.println("A password of 8 character");		
		test.setPassword(cliEntry.nextLine());
		
		try{
			test.checkPasswordSize();
		} catch (StringTooLong e) {
			System.out.println("Password too long, re-enter it");
			test.setPassword(cliEntry.nextLine());			
		} finally {
			System.out.println("Program end");
		}
		
	}

}
