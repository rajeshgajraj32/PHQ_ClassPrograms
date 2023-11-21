package com.Pratics;

public class StaticBlock {
    static final int a;
    static {
    	//this and super keyword ko static method/block ma use nhi kar sakte
    	a=12;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		
	}

}
