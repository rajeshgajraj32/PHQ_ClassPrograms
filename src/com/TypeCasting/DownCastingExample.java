package com.TypeCasting;
class Parent2 {
	void show(Parent2 p) {
		Child2 c = (Child2) p;
		System.out.println("Executing method of parent class");
	}
}
class Child2 extends Parent2 {
	void show(Parent2 p) {
		Child2 c = (Child2) p;
		System.out.println("Executing method of Child class");
	}
}
public class DownCastingExample {

	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.show(p);
	}
}
// Output: Executing method of parent class
