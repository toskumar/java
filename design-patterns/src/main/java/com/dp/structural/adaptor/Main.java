package com.dp.structural.adaptor;

public class Main {

	public static void main(String args[]) {
		Socket socket1 = new IndianSocket();
		Socket socket2 = new ChineseAdapter(new ChineseSocket());
		
		socket1.multiPin();
		socket2.multiPin();
	}
}
