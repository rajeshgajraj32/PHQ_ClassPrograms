package com.constructor;

public class CopyConstructorUsingDefaultConstructor {
	String name;
	int id;
	CopyConstructorUsingDefaultConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	CopyConstructorUsingDefaultConstructor(){}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		CopyConstructorUsingDefaultConstructor cc=new CopyConstructorUsingDefaultConstructor(101,"Gajraj");
		CopyConstructorUsingDefaultConstructor cc2=new CopyConstructorUsingDefaultConstructor();
		cc2.id=cc.id;
		cc2.name=cc.name;
		cc.display();
		cc2.display();

	}

}
