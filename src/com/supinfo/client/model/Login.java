package com.supinfo.client.model;

public abstract class Login {
	
	protected String name;
	protected String password;
	protected String eMail;
	
	//Constructor :
	protected Login(){
		name = "AcmeUser";
		password = "Daffy_Duck";
		eMail= "AcmeUser@acme.com";
	}

	@Override
	public String toString() {
		return "Login [name=" + name + ", password=" + password + ", eMail="
				+ eMail + "]";
	}
	
	//Methods :
	
}
