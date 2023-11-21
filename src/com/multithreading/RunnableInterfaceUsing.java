package com.multithreading;

public class RunnableInterfaceUsing implements Runnable{
	public void run() {
		for(int i=1;i<8;i++)
			System.out.println(Thread.currentThread().getName());
	}
    public static void main(String[] args) {
    	RunnableInterfaceUsing ri=new RunnableInterfaceUsing();
    	Thread t=new Thread(ri);
    	t.start();
    	
    	System.out.println("outer for loop: "+Thread.currentThread().getName());
		for(int i=1;i<7;i++)
			System.out.println("inner for loop: "+Thread.currentThread().getName());
	}
}
