package com.dp.structural.proxy;

public class Main {

	public static void main(String[] args)  {
		ProxyInternet proxy = new ProxyInternet();
		
		try {
			proxy.connect("google.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			proxy.connect("Abc.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
