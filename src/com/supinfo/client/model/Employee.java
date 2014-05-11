package com.supinfo.client.model;

public class Employee extends Login{

	public Employee(){
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + username + ", eMail="
				+ eMail + "]";
	}

	
}
