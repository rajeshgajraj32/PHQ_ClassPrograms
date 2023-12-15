package com.callByValue;

public class CallByValue {
    int number=10;
    public static void increment(int number) {
    	number=number+10;
    	System.out.println(number);
    }
	public static void main(String[] args) {
		CallByValue object=new CallByValue();
		System.out.println(object.number);
		increment(object.number);
		System.out.println(object.number);
	}

}
