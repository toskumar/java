package com.example.rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.RPC, use = Use.ENCODED)
public interface HelloWorld {

	@WebMethod
	public String greet(String name);
}
