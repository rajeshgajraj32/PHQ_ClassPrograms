package com.multithreading;

public class ThreadJoinMethod extends Thread{
   static Thread t=null;
   
   public void run() {
	   try {
		t.join(100);
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	   for(int r=0;r<5;r++) {
		   System.out.println("child thread");
	   }
   }
}
