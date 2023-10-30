package com.Pratics;
class FreePratics{
	// one parent class
	private int a=50;
	
	static void staticmethod() {
		// this static method and return type is void
		System.out.println("static method ");
	}
}
public class Pratics extends FreePratics {
	
	int x;
	static int a=10;
	public Pratics(int y) {
		// this constructor is used for initilaze varuable
		x=y;
		System.out.println(x);
		a++;
	}
	

	public static void main(String[] args) {
		// this is a main method for Pratics class
		//new Pratics(new Integer(4));
		//FreePratics fr=new FreePratics();
		//fr.staticmethod();
		
		//Pratics p=new Pratics(20);
		//System.out.println(a);
		
		try {
			System.out.println(args[2]);
		} catch (Exception e) {
			System.out.println("-1-------------");
			System.out.println(e);
			System.out.println("-2-------------");
			System.out.println(e.getMessage());
			System.out.println("-3-------------");
			e.getStackTrace();
			System.out.println("-4-------------");
			System.out.println(e.getStackTrace());
		}
		
	}
}
