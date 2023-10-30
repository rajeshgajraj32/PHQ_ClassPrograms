package com.question;

import java.util.Scanner;

public class DuplicatCharPrint {
	void chaeckString(String str) {
		int count=1;
		char first;
		for(int i=0;i<str.length();i++) {
			first=str.charAt(i);
			str=str.replaceFirst(String.valueOf(first), " ");
			str=str.replaceFirst(" ", "");
			//System.out.println(str);
			for(int j=i+1;j<str.length();j++) {
				if(first==str.charAt(j)) {
					count++;

					
				}
			}
			str=str.replaceAll(String.valueOf(str.charAt(i))," ");
			//System.out.println(str);
			System.out.println(first+" is "+count+" times");
			count=1;
        }
	}
	public static void main(String[] args) {
		DuplicatCharPrint dcp=new DuplicatCharPrint();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		dcp.chaeckString(str);

	}

}
