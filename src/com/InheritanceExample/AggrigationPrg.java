package com.InheritanceExample;
class Parent{
	int a =20;
}
public class AggrigationPrg extends Parent{
    int b=500;
	public static void main(String[] args) {
		//this is-a /inheritance example
		AggrigationPrg ap= new AggrigationPrg();
		System.out.println(ap.a);
		System.out.println(ap.b);
	}

}
