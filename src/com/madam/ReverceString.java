package com.madam;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String name =sc.nextLine();
		String nam=" ";
		char check =' ';
		
		for (int i=0; i<name.length(); i++)
	      {
			check= name.charAt(i); 
			nam= check+nam; 
	      }
	      System.out.println("Reverse word = "+ nam);
	      System.out.println(name.equals(nam));
	    }
	
	
	}
 

