package com.TypeCasting.InstanceOfOperator;
class Animal{
	static void method(Animal a) {
		if(a instanceof Dog) {
		  ((Dog) a).bark();
		}else {
			 ((Cat) a).mav();
		}
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog barking ");
	}
}
class Cat extends Animal{
	void mav() {
		System.out.println("cat move ");
	}
}
public class CastingSoutionUsingInstanceOf {
	
	public static void main(String[] args) {
		Animal a= new Cat();
		Cat.method(a);
		System.out.println(a.getClass().getName());

	}

}
