package com.example.rpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.rpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String greet(String name) {
		return "Hello " + name;
	}
}
