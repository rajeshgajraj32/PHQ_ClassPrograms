package com.question;
import java.util.*;
public class FindMissingNumberInArray {
    void display(int arr[]) {
    	int max=0;
    	StringBuffer str=new StringBuffer("Repeted Number is: ");
    	boolean repeat=false;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i]>arr[j]&&arr[i]!=0) {
    				max=arr[i];
    			}else if(arr[j]!=0) {
    				max=arr[j];
    			}
    			if(arr[i]==arr[j]) {
    				repeat=true;
    				arr[j]=0;
    			}
    		}
    		if(repeat&&arr[i]!=0) {
    			str.append(String.valueOf(arr[i])+",");
    		}
    		repeat=false;
    	}
    	repeat=false;
    	str.append("\nMissing Number is:");
    	for(int i=1;i<=max;i++) {
    		for(int num:arr) {
    			if(i==num) {
    				repeat=true;
    			}
    		}
    		if(!repeat) {
    			str.append(String.valueOf(i)+",");
    		}
    		repeat=false;
    	}
    	System.out.println(str);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter total Number:");
		//int total=sc.nextInt();
		int []list=new int[] {4,5,6,4,10,4,5,6,4,5,6};
		/*
		 * for(int i=0;i<total;i++) { System.out.println("Enter Number:");
		 * list[i]=sc.nextInt(); }
		 */
		FindMissingNumberInArray fna =new FindMissingNumberInArray();
		fna.display(list);
	}

}
