package com.multithreading.synchronize;

public class ThreadFirst extends Thread{
	Program1 p;
	ThreadFirst(Program1 p){
		this.p=p;
	}
		
	
   public void run() {
	   p.printInt();
   }
}
