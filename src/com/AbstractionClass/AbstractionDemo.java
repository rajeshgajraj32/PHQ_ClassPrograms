package com.AbstractionClass;
abstract class FirstClass{
	int a,b;
	/*
	FirstClass(int a,int b){
		System.out.println("constructor of class FirstClass in working");
		this.a=a;
		this.b=b;
	}
	*/
	abstract void show();
	public void firstdemo() {
		System.out.println("result of a is "+a+" and result of b is "+b);
	}
}
public class AbstractionDemo extends FirstClass{
	AbstractionDemo(){
		//super(10,50);
		this.a=50;
		this.b=10;
		System.out.println("working AbstractionDemo class constructor");
	}
	public void show() {
		System.out.println("abstract method of class firstcalss");
	}

	public static void main(String[] args) {
		AbstractionDemo ad=new AbstractionDemo();
		ad.show();
	    ad.firstdemo();
	    

	}

}
