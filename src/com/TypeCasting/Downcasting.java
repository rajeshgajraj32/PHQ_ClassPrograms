package com.TypeCasting;
class A{
	int a;
	A(int a){
		this.a=a;	}
	void showx() {
		System.out.println(a);
	}
}

public class Downcasting extends A{
	int b;
	Downcasting(int b,int c){
		super(c);
		this.b=b;
	}
	public void showy() {
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		A a=new A(50);
		a.showx();
		System.out.println("-------------------------");
		
		Downcasting dow=new Downcasting(10,20);
		dow.showx();
		dow.showy();
		System.out.println("-------------------------");
		
		A dow1=new Downcasting(200,600);  //upcasting  -->  child to parent
		//dow1.showy();  //showing undefinied method for class A
		dow1.showx();
		System.out.println("-------------------------");
		
		//Downcasting dow2=new A(10,20);  //showing cannot convert 
		//dow.showx();
		//dow.showy();
		System.out.println("-------------------------");
		
		Downcasting dow3=(Downcasting)dow1;
		dow3.showx();
		dow3.showy();
		System.out.println("-------------------------");
		
		Downcasting dow4=dow3;
		dow4.showx();
		dow4.showy();
		
		
		

	}

}
