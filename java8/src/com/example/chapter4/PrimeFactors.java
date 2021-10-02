package com.example.chapter4;

public class PrimeFactors {
	// A function to print all prime factors
	// of a given number n
	public static void primeFactors(long n) {

		// Print the number of 2s that divide n
		while (n % 2 == 0) {
			System.out.println(2 + " | " + n);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			n /= 2;
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// While i divides n, print i and divide n
			while (n % i == 0) {
				System.out.println(i + " | " + n);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~");
				n /= i;
			}

		}

		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (n > 2) {
			System.out.println(n + " | " + n);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}
		System.out.println("  | " + 1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		//long n = 999999000002L;
		long n = 1024*1024*1024;
		primeFactors(n);
	}
}