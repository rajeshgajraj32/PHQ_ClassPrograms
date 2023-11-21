package com.TypeCasting.InstanceOfOperator;
class ParentClass{
	int num=100;
	void display() {
		System.out.println(num);
	}
}
public class Child extends ParentClass {
	int num=200;
	void display() {
		System.out.println("child method calling");
	}
	public static void main(String[] args) {
		ParentClass p= new ParentClass();
		
		Child c =new Child();
		ParentClass p2=new Child();
		System.out.println(p instanceof ParentClass);
		System.out.println(c instanceof ParentClass);
		System.out.println(c instanceof Child);
		System.out.println(p instanceof Object);
		System.out.println(c instanceof Child);
		System.out.println(p instanceof Child);
		
		//child d1= new ParentClass();  //compile time exception 
		//Child c2=(Child)p; // java.lang.ClassCastException 
		//Child c2=(Child) new ParentClass(); // java.lang.ClassCastException 
		/*
		 * System.out.println(c2 instanceof ParentClass); System.out.println(c2
		 * instanceof Child); System.out.println(c2 instanceof Object);
		 */
        // parent variable and method accessing
		p.display();   // 100
		p2.display();  //child method calling
		c.display();   //child method calling
		System.out.println(p.num);  //100
		System.out.println(p2.num); //100
		System.out.println(c.num);  //200
		
		p=null;
		System.out.println(p instanceof ParentClass);
		System.out.println(p instanceof Object);
		//Child c2 =(Child)new ParentClass();  //java.lang.ClassCastException:
	}

}
