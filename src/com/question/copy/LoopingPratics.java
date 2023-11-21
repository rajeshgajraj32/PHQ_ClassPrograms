package com.question.copy;

import java.util.Scanner;

public class LoopingPratics {
	static Scanner sc=new Scanner(System.in);
     void loop() {
    	 for(int i=0;i<5;i++) {
    		 for(int j=0;j<=i;j++) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
    	 System.out.println("------------------");
    	 for(int i=0;i<=10;i++) {
    		 if(i<5) {
    			 for(int j=0;j<=10;j++) {
        			 if(j==(5-i)||j==(5+i)) {
        				 System.out.print("*");
        			 }
        			 else {
        				 System.out.print(" ");
        			 }
        		 }
    			 System.out.println();
    		 }
    		 else {
    			 for(int j=0;j<=10;j++) {
        			 if(j==(15-i)||j==(i-5)) {
        				 System.out.print("*");
        			 }
        			 else {
        				 System.out.print(" ");
        			 }
    		 }
    		 
    		 System.out.println();
    	 }
    	 }
    	 System.out.println("------------------");
    	 char ch='A';
    	 for(int i=0;i<5;i++) {
    		 for(int j=0;j<=10;j++) {
    			 if(j>=(6-i)&&j<=(6+i)) {
    				 System.out.print(ch);
    				 ch++;
    			 }
    			 else {
    				 System.out.print(" ");
    			 }
    		 }
    		 System.out.println();
    		 ch='A';
    	 }
    	 System.out.println("----------------");
    	 for(int i=1;i<=100;i++) {
    		 if(i%2!=0&&i%3!=0) 
    		 System.out.print(i+",");
    	 }
    	 System.out.println();
    	 System.out.println("----------------");
    	 System.out.println("enter number how many interger you enter:");
    	 int length=sc.nextInt();
    	 int arr[]=new int[length];
    	 for(int i=1;i<=length;i++) {
    	 System.out.println("Enter value number "+i+" :");
    	 arr[i-1]=sc.nextInt();
    	 }
    	 for(int i=1;i<=length;i++) {
    		 System.out.print(arr[length-i]+",");
    	 }
    	 
     }
	public static void main(String[] args) {
		LoopingPratics lp= new LoopingPratics();
		lp.loop();
	}

}
