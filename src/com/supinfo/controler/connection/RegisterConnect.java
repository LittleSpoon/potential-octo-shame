package com.supinfo.controler.connection;

import com.supinfo.client.model.DefaultServer;
import com.supinfo.controler.validator.RegisterCheck;

public class RegisterConnect extends RegisterCheck {

	public RegisterConnect() {
		// TODO Auto-generated constructor stub
	}

	public RegisterConnect(String loginId, String loginPW, String loginEMail) {
		super(loginId, loginPW, loginEMail);
		// TODO Auto-generated constructor stub
	}

	public void sendRegister(){
		ConnectToServer sendRegisterToServer = new ConnectToServer(DefaultServer.defaultServer,DefaultServer.defaultPort,"REGISTER USERNAME "+username+" PASSWORD "+password+ " EMAIL "+ eMail);
		sendRegisterToServer.openConnection();
	}
	
}
