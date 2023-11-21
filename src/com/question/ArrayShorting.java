package com.question;

import java.util.Scanner;

public class ArrayShorting {
    static void reversArray(int arr[]) {
    	int temp=0;
    	for(int i=0;i<arr.length;i++)
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]>arr[j])
    			{
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    			}
    		}
    	for(int a:arr)
    		System.out.print(a+" ");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length:");
		int arrLength=sc.nextInt();
		int normal[]=new int[arrLength];
		for(int i=0;i<arrLength;i++) {
			System.out.println("Enter number:");
			normal[i]=sc.nextInt();
		}
		reversArray(normal);

	}

}
