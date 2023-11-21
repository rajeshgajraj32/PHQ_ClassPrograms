package com.multithreading.synchronize;

public class SynBlockFirst extends Thread{
	SynBlockProgram p;
	SynBlockFirst(SynBlockProgram p){
		this.p=p;
	}
	public void run() {
		p.show();
	}
}
