package com.dp.behavior.iterator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Stack stack = new StackImpl(10);

		for(int i=1;i<=9;i++) {
			stack.push(i*10);
		}
		
		System.out.println(Arrays.toString(stack.elements()));
		System.out.println("poped item is " + stack.pop());
		System.out.println(Arrays.toString(stack.elements()));
		
		MyIterator iter = stack.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
	}

}
