package com.constructor;

public class CopyConstructurIUsingConstructor {
	String name;
	int id;
	CopyConstructurIUsingConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	CopyConstructurIUsingConstructor(CopyConstructurIUsingConstructor c){
		id=c.id;
		name=c.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		CopyConstructurIUsingConstructor c=new CopyConstructurIUsingConstructor(101,"Rajesh");
		CopyConstructurIUsingConstructor c2=new CopyConstructurIUsingConstructor(c);
		c.display();
		c2.display();
	}

}
