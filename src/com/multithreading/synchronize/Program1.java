package com.multithreading.synchronize;

public class Program1 {
	public synchronized void printInt() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread is intrepted");
			}
		}
	}
	public synchronized void printChar() {
		for (int i = 97; i < 108; i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread is intrepted");
			}
		}
	}

}
