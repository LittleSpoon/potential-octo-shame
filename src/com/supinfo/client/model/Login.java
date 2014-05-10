package com.supinfo.client.model;

public abstract class Login {
	
	protected String username;
	protected String password;
	protected String eMail;
	
	//Constructor :
	protected Login(){
		username = null;
		password = null;
		eMail = null;
	}

	@Override
	public String toString() {
		return "Login [name=" + username + ", password=" + password + ", eMail="
				+ eMail + "]";
	}
	
	//Methods :
	
}
