package com.supinfo.client.model;

public class Manager extends Employee{

	public Manager(){
		super();
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + username + ", eMail="
				+ eMail + "]";
	}
}
