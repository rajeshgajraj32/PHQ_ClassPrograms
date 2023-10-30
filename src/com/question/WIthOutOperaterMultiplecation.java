package com.question;

import java.util.Scanner;

public class WIthOutOperaterMultiplecation {
    strictfp int multipleResult(int a,int b) {
    	int result =0;
    	for(int i=1;i<=b;i++) {
    		result+=a;
    	}
    	return result;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a first number:");
		int a= sc.nextInt();
		System.out.println("enter a second number:");
		int b= sc.nextInt();
		sc.close();
		WIthOutOperaterMultiplecation wom = new WIthOutOperaterMultiplecation();
		System.out.println(wom.multipleResult(a,b));
	}

}
