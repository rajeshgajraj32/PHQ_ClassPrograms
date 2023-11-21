package com.question.copy;

import java.util.Scanner;

public class NumberDifference {
	static Scanner sc=new Scanner(System.in);
    static Integer arr[]=new Integer[20];
    	static void findValue() {
    		int result=0;
    	for(int i=0;i<20;i++) {
    		System.out.println("Enter a number:");
    		arr[i]=sc.nextInt();
    	}
    	for(int x:arr) {
    		if(x>0) {
    			result++;
    		}
    	}
    	System.out.println("Total Positive number: "+result);
    	result=0;
    	for(int x:arr) {
    		if(x<0) {
    			result++;
    		}
    	}
    	System.out.println("Total Negative number: "+result);
    	result=0;
    	for(int x:arr) {
    		if(x==0) {
    			result++;
    		}
    	}
    	System.out.println("Total Zero number: "+result);
    	result=0;
    	for(int x:arr) {
    		if(x%2==0) {
    			result++;
    		}
    	}
    	System.out.println("Total even number: "+result);
    	result=0;
    	for(int x:arr) {
    		if(x%2!=0) {
    			result++;
    		}
    	}
    	System.out.println("Total Odd number: "+result);
    	}
	public static void main(String[] args) {
		findValue();

	}

}
