package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstException {

	public static void main(String[] args) {
		try {
			
			
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter a number: ");
			 int a= Integer.parseInt(br.readLine());
			 System.out.println("enter a number: ");
			 int b= Integer.parseInt(br.readLine());
			 br.close();
			 int c=a/b;
			 System.out.println(c);
			 
		} catch (IOException|ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			e.getStackTrace();
		}
		

	}

}
