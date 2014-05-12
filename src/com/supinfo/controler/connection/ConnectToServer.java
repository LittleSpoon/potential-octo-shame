package com.supinfo.controler.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectToServer {
	
	private int portNumber;
	private String serverHostname;
	
	public void ConnectToServer() {
		this.ConnectToServer("NOVA", 4165);		
	}
	
	public void ConnectToServer(String hostname,int port){
		this.portNumber = port;
		this.serverHostname = hostname;
		this.openConnection();
	}
	
	private void openConnection() {
		try(
			Socket clientSocket =new Socket(serverHostname, portNumber);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in =new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
		) {
			BufferedReader st
		
		
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host " + serverHostname);
			System.exit(1);
		} catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    serverHostname);
            System.exit(1);
		} finally {
			
		}
		
	}
	
	private void 

}
