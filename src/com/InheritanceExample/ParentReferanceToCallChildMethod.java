package com.InheritanceExample;
class ParentClass{
	/*
	void show() {
		System.out.println("Parent class show method ");
	}
	*/
}
class ChildClass extends ParentClass{
	void show() {
		System.out.println("Child class show method");
	}
}
public class ParentReferanceToCallChildMethod {

	public static void main(String[] args) {
		ParentClass pc= new ChildClass();
		// pc.show();   //compilation error

	}

}
