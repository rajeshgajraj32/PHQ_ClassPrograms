package com.multithreading;

public class ThreadClassUse extends Thread {
    public void run() {
    	for(int i=1;i<7;i++)
    	System.out.println(Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		ThreadClassUse t =new ThreadClassUse();
		t.start();
		System.out.println("outer for loop: "+Thread.currentThread().getName());
		for(int i=1;i<7;i++)
			System.out.println("inner for loop: "+Thread.currentThread().getName());
		

	}

}
