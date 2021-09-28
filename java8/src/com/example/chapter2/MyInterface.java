package com.example.chapter2;

public class MyInterface {

	MyInterface() {
	}
	public static void main(String args[]) {
		Driver oracleDriver = new OracleDatabase();
		oracleDriver.connect();
		
		Driver mysqlDriver = new MySQLDatabase();
		mysqlDriver.connect();
	}
}

interface Driver {
	void connect();
}

class OracleDatabase implements Driver {
	@Override
	public void connect() {
		System.out.println("Conntected to Oracle Database");
	}
}

class MySQLDatabase implements Driver {
	@Override
	public void connect() {
		System.out.println("Conntected to MySQL Database");
	}
}