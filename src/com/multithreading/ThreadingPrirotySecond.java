package com.multithreading;

public class ThreadingPrirotySecond {

	public static void main(String[] args) {
		System.out.println("Main: "+Thread.currentThread().getPriority());
		ThreadingPrirotyFirst t=new ThreadingPrirotyFirst();
		ThreadingPrirotyFirst t2=new ThreadingPrirotyFirst();
		Thread.currentThread().setPriority(2);
		t.setName("first");
		t2.setName("second");
		t.start();
		try {
			//t.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("Main: "+Thread.currentThread().getPriority());
		for(int i=1;i<5;i++)
			System.out.println("Main thread: "+i);

	}

}
