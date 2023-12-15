package com.callByReference;

public class CallByReference {
    int number=10;
    public static void increment(CallByReference obj) {
    	obj.number=obj.number+10;
    	System.out.println(obj.number);
    }
	public static void main(String[] args) {
		CallByReference obj=new CallByReference();
		System.out.println(obj.number);
		increment(obj);
		System.out.println(obj.number);
	}

}
