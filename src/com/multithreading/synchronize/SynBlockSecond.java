package com.multithreading.synchronize;

public class SynBlockSecond extends Thread{
	SynBlockProgram p;
	SynBlockSecond(SynBlockProgram p){
		this.p=p;
	}
	public void run() {
		p.show();
	}
}
