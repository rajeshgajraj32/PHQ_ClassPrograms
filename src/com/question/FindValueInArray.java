package com.question;

import java.util.Scanner;

public class FindValueInArray {
    static Scanner sc=new Scanner(System.in);
    static Integer arr[]=new Integer[10];
    	static void findValue() {
    		boolean result=false;
    	for(int i=0;i<10;i++) {
    		System.out.println("Enter a number:");
    		arr[i]=sc.nextInt();
    	}
    	System.out.println("Enter a number for find value :");
		int find=sc.nextInt();
		for(int x:arr) {
			if(find==x) {
				result=true;
				break;
			}
		}
		if(result){
			System.out.println("your value "+find+" is persent in array");
		}
		else {
			System.out.println("your value "+find+" is not persent in array");
		}
    }
	public static void main(String[] args) {
		findValue();

	}

}
