package com.multithreading.synchronize;

public class SynchronizeMain {
	public static void main(String[] args) {
		Program1 p= new Program1();
		//Program1 p2= new Program1();
		
		ThreadFirst first= new ThreadFirst(p);
		ThreadSecond second = new ThreadSecond(p);
		//ThreadSecond second = new ThreadSecond(p2);
		
		first.start();
		second.start();

	}
}
