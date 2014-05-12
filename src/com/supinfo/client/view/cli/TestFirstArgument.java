package com.supinfo.client.view.cli;

public class TestFirstArgument {
	
	private String value;
	
	public TestFirstArgument(String[] args){
		
		value = args[0];
		
	}

	@Override
	public String toString() {
		return value;
	}
	
	
}
