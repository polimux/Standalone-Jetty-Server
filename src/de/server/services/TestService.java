package de.server.services;

import java.util.Date;

public class TestService {

	public static String getHelloWorld() {
		String helloWorld = "<html><head><title>TestServlet</title></head>" +
		"<body><h1>Welcome to the Test Servlet</h1>" +
		"<p>"+new Date().toString()+"</p></body></html>";
		
		return helloWorld;
	}

}
