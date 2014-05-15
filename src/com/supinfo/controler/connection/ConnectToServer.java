package com.supinfo.controler.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.supinfo.client.model.DefaultServer;

public class ConnectToServer {
	
	private int portNumber;
	private String serverHostname;
	private String fromServer;
	private String fromClient;
	
	public ConnectToServer() {
		this.portNumber = DefaultServer.defaultPort;
		this.serverHostname = DefaultServer.defaultServer;
		this.fromClient = "TEST";	
	}
	
	public ConnectToServer(String hostname,int port, String stringToSend){
		this.portNumber = port;
		this.serverHostname = hostname;
		this.fromClient = stringToSend;
	}
	
	public void openConnection() {
		try(
			Socket clientSocket = new Socket(serverHostname, portNumber);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in =new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
		) {
			
				sendString(out,in);
			
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
	
	private void sendString(PrintWriter out,BufferedReader in) throws IOException{
		while ((fromServer = in.readLine()) != null) {
			
            if (fromClient != null) {
               out.println(fromClient);
            }
			
           System.out.println("Server: " + fromServer);
           if (fromServer.equals("Bye."))
               break;
          
       }
		
	}
	
	
}
