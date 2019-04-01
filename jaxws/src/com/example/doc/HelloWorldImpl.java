package com.example.doc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.doc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String greet(String name) {
		return "Hello " + name;
	}
}
