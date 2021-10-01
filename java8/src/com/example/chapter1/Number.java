package com.example.chapter1;

class Number1 {

	int a, b, c;

	Number1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int add() {
		c = a + b;
		return c;
	}
}

class Number2 {

	int add(int a, int b) {
		return a + b;
	}
}

class Number3 {

	static int add(int a, int b) {
		return a + b;
	}
}

class Number {

	public static void main(String args[]) {

		Number1 n1 = new Number1(5, 5);
		System.out.println("Number 1 sum = " + n1.add());

		Number2 n2 = new Number2();
		System.out.println("Number 2(i) sum = " + n2.add(10, 10));
		System.out.println("Number 2(ii) sum = " + n2.add(10, 20));

		System.out.println("Number 3 sum = " + Number3.add(10, 30));

		// Number4 with arguments
		if (args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a + b;
			System.out.println("Number 4 sum = " + c);
		}
	}
}
