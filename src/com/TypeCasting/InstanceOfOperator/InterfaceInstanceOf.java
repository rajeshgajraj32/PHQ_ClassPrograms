package com.TypeCasting.InstanceOfOperator;
interface Parent{
	
}
public class InterfaceInstanceOf implements Parent{

	public static void main(String[] args) {
		InterfaceInstanceOf c= new InterfaceInstanceOf();
		Parent p=new InterfaceInstanceOf();
		System.out.println(c instanceof InterfaceInstanceOf);
		System.out.println(p instanceof InterfaceInstanceOf);
		System.out.println(c instanceof Parent);
		System.out.println(p instanceof Parent);

	}

}
