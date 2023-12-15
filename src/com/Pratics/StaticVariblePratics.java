package com.Pratics;

class Parent {

}

public class StaticVariblePratics {
	static Parent parent;
	static int a = 10;
	int b = 15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariblePratics svb = new StaticVariblePratics();
        Long l=(long) 10;
        
        float f[]= {1,2,3,505.2f,50.65f};
		for (int i = -2; i < 2; ++i) {
			System.out.println(i);
		}
		System.out.println(a);
		System.out.println(svb.b);

		System.out.println(parent instanceof Parent);
		System.out.println(l instanceof Object);
	}

}
