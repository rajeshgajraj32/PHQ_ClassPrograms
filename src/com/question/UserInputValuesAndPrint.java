package com.question;

import java.util.Scanner;

public class UserInputValuesAndPrint {
    void printUserValues() {
    	Scanner sc =new Scanner(System.in);
    	Integer arr[]=new Integer[10];
    	for(int i=0;i<10;i++) {
    		System.out.println("Enter a number:");
    		arr[i]=sc.nextInt();
    	}
    	for(int a:arr) {
    		System.out.println(a);
    	}
    }
	public static void main(String[] args) {
		UserInputValuesAndPrint uivap=new UserInputValuesAndPrint();
		uivap.printUserValues();

	}

}
