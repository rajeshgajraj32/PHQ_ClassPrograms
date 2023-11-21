package com.multithreading.synchronize;

public class ThreadSecond extends Thread{
	Program1 p;
	ThreadSecond(Program1 p){
		this.p=p;
	}
		
	
   public void run() {
	   p.printChar();
   }
}
