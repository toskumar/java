package com.example.chapter2;

/**
 * Interface contains abstract method and constants 
 *
 */
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
	static final String PROTOCOL = "JDBC";
	void connect();
}

class OracleDatabase implements Driver {
	@Override
	public void connect() {
		System.out.println("Conntected to Oracle Database using " + PROTOCOL);
	}
}

class MySQLDatabase implements Driver {
	@Override
	public void connect() {
		System.out.println("Conntected to MySQL Database using " + PROTOCOL);
	}
}