package com.supinfo.controler.connection;

import com.supinfo.client.model.DefaultServer;
import com.supinfo.controler.validator.LoginCheckPassword;

public class LoginConnect extends LoginCheckPassword {

	public LoginConnect() {
		// TODO Auto-generated constructor stub
	}

	public LoginConnect(String loginId, String loginPW) {
		super(loginId, loginPW);
		// TODO Auto-generated constructor stub
	}

	public void sendLogin(){
		ConnectToServer sendLoginToServer = new ConnectToServer(DefaultServer.defaultServer,DefaultServer.defaultPort,"LOGIN USERNAME "+username+" PASSWORD "+password);
		sendLoginToServer.openConnection();
	}
}
