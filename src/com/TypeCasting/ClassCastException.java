package com.TypeCasting;
class Parent{
	void show(Parent p) {
		Child c=(Child)p;
		System.out.println("Executing method of parent class");
	}
}
class Child extends Parent{
	void show(Parent p) {
		Child c=(Child)p;
		System.out.println("Executing method of Child class");
	}
}
public class ClassCastException {

	public static void main(String[] args) {
		Parent p =new Parent();
		p.show(p);

	}

}
