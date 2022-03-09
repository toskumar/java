package com.example.chapter4;

import java.util.ArrayList;
import java.util.List;

class Stack {

	private List<Integer> items;

	public Stack() {
		items = new ArrayList<Integer>();
	}

	public synchronized int pop() throws Exception {

		System.out.println(Thread.currentThread().getName() + " => pop");
		int size = items.size();
		int value = 0;
		if (size > 0) {
			value = items.remove(size - 1);
		}else {
			System.out.println("Item size is Zero so waiting ... ");
			this.wait();
		}
		this.notify();
		return value;
	}
	
	public synchronized void push() throws Exception {
		System.out.println(Thread.currentThread().getName() + " => push");
		if(items.size() > 10) {
			System.out.println("Item size is greater than 10 waiting ... ");
			wait();
		}
		items.add((int) Math.random() * 1000);
		notify();
	}

}

public class StackThread {

	public static void main(String args[]) {

		Stack myStack = new Stack();

		Runnable r1 = () -> {
			while(true) {
				try {
					myStack.push();
					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable r2 = () -> {
			while(true){
				try {
					myStack.pop();
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r1, "Thread-1");
		t1.start();

		Thread t2 = new Thread(r2, "Thread-2");
		t2.start();

	}
}
