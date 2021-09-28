package com.example.chapter3;

public class MyDevice {
	public static void main(String arg[]) {
		Epson2010 e2010 = new Epson2010();
		e2010.model();
		e2010.print();

		Epson3010 e3010 = new Epson3010();
		e3010.model();
		e3010.print();
		e3010.scan();
		e3010.copy();
	}
}

abstract class Printer {
	abstract void print();
	abstract void model();
}

abstract class SingleFunctionPrinter extends Printer {
	void print() {
		System.out.println("SingleFunctionPrinter printing ...");
	}
}

abstract class MultiFunctionPrinter extends SingleFunctionPrinter {
	void print() {
		System.out.println("MultiFunctionPrinter printing ...");
	}

	public void scan() {
		System.out.println("MultiFunctionPrinter scanning ...");
	}

	public void copy() {
		System.out.println("MultiFunctionPrinter copying ...");
	}
}

final class Epson2010 extends SingleFunctionPrinter {
	void model() {
		System.out.println("Category: SingleFunctionPrinter, Model: Epson 2010");
	}
}

final class Epson3010 extends MultiFunctionPrinter {
	void model() {
		System.out.println("Category: MultiFunctionPrinter, Model: Epson 3010");
	}
}
