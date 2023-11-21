package com.multithreading.synchronize;

public class SynBlockMain {

	public static void main(String[] args) {
		SynBlockProgram p1=new SynBlockProgram();
		
		SynBlockFirst sf=new SynBlockFirst(p1);
		SynBlockSecond ss =new SynBlockSecond(p1); 
		
		sf.start();
		ss.start();

	}

}
