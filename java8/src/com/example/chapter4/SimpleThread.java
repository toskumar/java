package com.example.chapter4;

public class SimpleThread {

	public static void main(String args[]) {

		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(r1, "Thread-1").start();
		new Thread(r1, "Thread-2").start();

	}
}
