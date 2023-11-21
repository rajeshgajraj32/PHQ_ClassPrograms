package com.multithreading;

public class ThreadingPrirotyFirst extends Thread       {
	static String thread_name;
   public void run() {
	   if(Thread.currentThread().getName()=="first")
		   thread_name="first thread";
	   else
		  
		   thread_name="second thread";
	   //System.out.println("child : "+Thread.currentThread().getPriority());
	   for(int i=1;i<5;i++)
		   System.out.println(thread_name);
	   //Thread.currentThread().setPriority(9);
	   //System.out.println("child : "+Thread.currentThread().getPriority());
   }
}
