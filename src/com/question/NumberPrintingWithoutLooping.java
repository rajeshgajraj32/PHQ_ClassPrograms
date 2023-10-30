package com.question;

import java.util.Scanner;
//write a java program to print number from 1 to N number without using loops
public class NumberPrintingWithoutLooping {
	int b=1;
    public Object numPrint(int a) {
        
    	if(b<=a) {
    		System.out.println(b);
    		b++; 
    		return numPrint(a);
    	}
    	else {
    		return null;
    	}
    	
    	
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int a= sc.nextInt();
		NumberPrintingWithoutLooping npwl= new NumberPrintingWithoutLooping();
		npwl.numPrint(a);

	}

}
