package com.example.chapter4;

public class Num2Words {

	public static void toWords(int number) {
		
		int len = String.valueOf(number).length();
		switch(len) {
			case 1: if(number == 0) break;
			case 2: printTensOnes(number);break;
			case 3: {
				printOnes(number/100); 
				System.out.print("HUNDRED ");
				toWords(number-(number/100)*100);
				break;
			}
			case 4:
			case 5:
			{
				
				printTensOnes(number/1000); 
				System.out.print("THOUSAND "); 
				toWords(number-(number/1000)*1000);
				break;			
			}
			case 6:
			case 7:
			{
				printTensOnes(number/100000); 
				System.out.print("LAKH "); 
				toWords(number-(number/100000)*100000);
				break;			
			}
			case 8:
			case 9:
			{
				printTensOnes(number/10000000); 
				System.out.print("CRORE "); 
				toWords(number-(number/10000000)*10000000);
				break;			
			}
			case 10:
			case 11:
			{
				toWords(number-(number/1000000000)*1000000000);
				System.out.print("CRORE "); 
			}
		}
	}


	private static void printTensOnes(int number) {

		if (number >= 0 && number <= 9)
			printOnes(number);

		else if (number >= 10 && number <= 19)
			switch (number) {
			case 10:
				System.out.print("TEN ");
				break;
			case 11:
				System.out.print("ELEVEN ");
				break;
			case 12:
				System.out.print("TWELVE ");
				break;
			case 13:
				System.out.print("THIRTEEN ");
				break;
			case 14:
				System.out.print("FORTEEN ");
				break;
			case 15:
				System.out.print("FIFTEEN ");
				break;
			case 16:
				System.out.print("SIXTEEN ");
				break;
			case 17:
				System.out.print("SEVENTEEN ");
				break;
			case 18:
				System.out.print("EIGHTEEN ");
				break;
			case 19:
				System.out.print("NINETEEN ");
				break;
			}
		else if (number >= 20 && number <= 99) {

			switch ((number / 10) * 10) {
			case 20:
				System.out.print("TWENTY ");
				break;
			case 30:
				System.out.print("THIRTY ");
				break;
			case 40:
				System.out.print("FORTY ");
				break;
			case 50:
				System.out.print("FIFTY ");
				break;
			case 60:
				System.out.print("SIXTY ");
				break;
			case 70:
				System.out.print("SEVENTY ");
				break;
			case 80:
				System.out.print("EIGHTY ");
				break;
			case 90:
				System.out.print("NINTY ");
				break;
			}
			
			if (number % 10 != 0) {
				printOnes(number%10);
			}
		}


	}

	private static void printOnes(int number) {
		switch (number) {
		case 0:
			System.out.print("ZERO ");
			break;
		case 1:
			System.out.print("ONE ");
			break;
		case 2:
			System.out.print("TWO ");
			break;
		case 3:
			System.out.print("THREE ");
			break;
		case 4:
			System.out.print("FOUR ");
			break;
		case 5:
			System.out.print("FIVE ");
			break;
		case 6:
			System.out.print("SIX ");
			break;
		case 7:
			System.out.print("SEVEN ");
			break;
		case 8:
			System.out.print("EIGHT ");
			break;
		case 9:
			System.out.print("NINE ");
			break;
		}
	}

	public static void main(String args[]) {
		Num2Words.toWords(999999999);System.out.println();
		Num2Words.toWords(123456789);System.out.println();
		Num2Words.toWords(12345678);System.out.println();
		Num2Words.toWords(1234567);System.out.println();
		Num2Words.toWords(123456);System.out.println();
		Num2Words.toWords(12345);System.out.println();
		Num2Words.toWords(1234);System.out.println();
		Num2Words.toWords(123);System.out.println();
		Num2Words.toWords(12);System.out.println();
		Num2Words.toWords(1);System.out.println();
	
		Num2Words.toWords(100000000);System.out.println();
		Num2Words.toWords(10000000);System.out.println();
		Num2Words.toWords(1000000);System.out.println();
		Num2Words.toWords(100000);System.out.println();
		Num2Words.toWords(10000);System.out.println();
		Num2Words.toWords(1000);System.out.println();
		Num2Words.toWords(100);System.out.println();
		Num2Words.toWords(10);System.out.println();
		Num2Words.toWords(1);System.out.println();
		Num2Words.toWords(0);System.out.println();
		
	}
}