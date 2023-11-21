package com.multithreading.synchronize;

public class SynBlockProgram {
	public void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("running Before" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//synchronized (SynBlockProgram.class) { //This is class level lock-- static and non static methods allow
		synchronized (this) { //This is object level lock-- only non static methods
			for (int j = 0; j < 5; j++) {
				System.out.println("running Block" + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (int j = 0; j < 5; j++) {
			System.out.println("running After Block" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
