package com.multithreading;

public class ThreadingJoinMethodMain extends Thread{

	public static void main(String[] args) {
		try {
			ThreadJoinMethod.t=Thread.currentThread();
			ThreadJoinMethod t2=new ThreadJoinMethod();
			t2.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("parent thread");
		}

	}

}
