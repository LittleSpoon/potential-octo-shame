package com.supinfo.client.view.cli;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgumentParser testParser = new ArgumentParser(args);
				
		testParser.checkRegistration();
		
		System.out.println("end of program");
	}

}
