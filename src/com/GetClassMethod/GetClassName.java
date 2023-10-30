package com.GetClassMethod;
class A{
	void aaa() {
		System.out.println("class A calling");
	}
}
public class GetClassName {
  public static void main(String[] args) throws ClassNotFoundException {
	A a=new A();
	System.out.println(a.getClass());
	System.out.println(Class.forName("a"));
}
}
