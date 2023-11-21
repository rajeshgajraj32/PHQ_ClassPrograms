package com.multithreading;

public class ThreadIntreptedParent {

	public static void main(String[] args) {
		ThreadIntreptedChild t = new ThreadIntreptedChild();
		t.start();
		t.interrupt();
		for(int i=0;i<10;i++)
			System.out.println("Parent Thread ");
	}

}
