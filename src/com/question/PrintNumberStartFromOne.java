package com.question;

import java.util.Scanner;

public class PrintNumberStartFromOne {

	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println("Enter number:");
		 * arr[i]=sc.nextInt(); }
		 */
		System.out.println("Result: ");
		for(int j=0;j<arr.length;j++) {
			if(arr[j]/100==1) {
				System.out.println(arr[j]);
			}
		}
        long endtime=System.currentTimeMillis();
        System.out.println(endtime-starttime);
	}

}
