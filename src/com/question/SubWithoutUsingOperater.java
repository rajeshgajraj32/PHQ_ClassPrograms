package com.question;

import java.util.Scanner;

public class SubWithoutUsingOperater {
	void sub(int a, int b) {
		int d=0;
    	if(a<0&&b<0) {
            	for(int c=a;c<=a-b;c--) {d=c;   		
            	}
            	System.out.println("Addition of your number is: "+d);
    	}
    	else if(a>b&&a>=0) {
        	for(int c=b;c>=a-b;c++) {d=c;   		
        	}
        	System.out.println("Addition of your number is: "+d);
    	}else {
    		for(int c=a;c>=a-b;c++) {d=c;   		
        	}
        	System.out.println("Addition of your number is: "+d);
    	}
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a first number:");
		int a= sc.nextInt();
		System.out.println("enter a second number:");
		int b= sc.nextInt();
		SubWithoutUsingOperater suo= new SubWithoutUsingOperater();
		suo.sub(a, b);

	}

}
