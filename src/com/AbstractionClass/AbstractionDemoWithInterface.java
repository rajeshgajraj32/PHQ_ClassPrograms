package com.AbstractionClass;
interface FirstInterface{
	public static final int x=50;
	int y=10;
	public abstract void FirstInterface();
	abstract void ram();
	void sita();
	
}
public class AbstractionDemoWithInterface implements FirstInterface{
	AbstractionDemoWithInterface(){
		super();
		System.out.println("concreat class constructor is running...");
	}
	public void ram() {
		System.out.println("interface method ram is running .......");
	}
	public void sita() {
		System.out.println("interface method sita is running........");
	}
	@Override
	public void FirstInterface() {
		System.out.println("what this method is not a constructor if not then why ?");
	}

	public static void main(String[] args) {
		AbstractionDemoWithInterface adwi= new AbstractionDemoWithInterface();

	}

}
