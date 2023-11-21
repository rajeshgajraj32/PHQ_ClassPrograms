package com.question.copy;
 class SuperClass{
	 
 }
public class PrintCurrentClassName extends SuperClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCurrentClassName pc= new PrintCurrentClassName();
        Class child=pc.getClass();
		System.out.println(child.getName());
		Class sc=child.getSuperclass();
		System.out.println(sc.getName());
	}

}
