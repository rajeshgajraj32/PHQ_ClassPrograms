package com.multithreading;

public class ThreadIntreptedChild extends Thread{
  public void run() {
	  for(int i=0;i<10;i++)
		  System.out.println("Child Thread num: "+i);
	  System.out.println(Thread.currentThread().isAlive());
	  //Thread.currentThread().stop();
	  try {
		  Thread.currentThread().sleep(5000);
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	  System.out.println(Thread.currentThread().isAlive());
	  
  }
}
