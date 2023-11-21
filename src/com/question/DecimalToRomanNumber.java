package com.question;

import java.util.Scanner;

public class DecimalToRomanNumber {
	public static void intToRoman(int num)   
	{  
	System.out.println("Integer: " + num);  
	int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
	String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
	StringBuilder roman = new StringBuilder();  
	for(int i=0;i<values.length;i++)   
	{  
	while(num >= values[i])   
	{  
	num = num - values[i];  
	roman.append(romanLetters[i]);  
	}  
	}  
	System.out.println("Corresponding Roman Numerals is: " + roman.toString());  
	}  

	/*
	 * static void romanNumber(int n) { int a=n,b=0; String roman=""; int[] values =
	 * {1000,900,500,400,100,90,50,40,10,9,5,4,1}; String[] romanLetters =
	 * {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; while(a>0) {
	 * if(a>999) { b=a/1000; a=a%1000; if(b==4) { roman=roman+romanLetters[11]; }
	 * else if(b==5) { roman=roman+romanLetters[10]; } else if(b==9) {
	 * roman=roman+romanLetters[9]; } else if(b<4) { roman=roman+romanLetters[10];
	 * for(int i=1;i<=b;i++) { roman=roman+romanLetters[12]; }
	 * 
	 * } else if(b>5) { for(int i=1;i<=b-5;i++) roman=roman+romanLetters[12];
	 * roman=roman+romanLetters[10]; } roman=roman+romanLetters[0]; }else if(a>99) {
	 * b=a/100; a=a%100; if(b==9) { roman=roman+romanLetters[1];
	 * roman=roman+romanLetters[4]; } else if(b==5) { roman=roman+romanLetters[2];
	 * roman=roman+romanLetters[4]; } else if(b==4) { roman=roman+romanLetters[3];
	 * roman=roman+romanLetters[4]; } else if(b==1) { roman=roman+romanLetters[4];
	 * roman=roman+romanLetters[4]; } else if(b>5) { roman=roman+romanLetters[2];
	 * for(int i=1;i<=b-5;i++) roman=roman+romanLetters[12];
	 * 
	 * } else if(b>1) { for(int i=1;i<=b;i++) roman=roman+romanLetters[12];
	 * roman=roman+romanLetters[4]; } }else if(a>9) { b=a/10; a=a%10; if(b==9)
	 * roman=roman+romanLetters[5]; else if(b==5) roman=roman+romanLetters[6]; else
	 * if(b==4) roman=roman+romanLetters[7]; else if(b==1)
	 * roman=roman+romanLetters[8]; else if(b>5) { roman=roman+romanLetters[6];
	 * for(int i=1;i<=b-5;i++) roman=roman+romanLetters[12];
	 * 
	 * } else if(b>1) { for(int i=1;i<=b;i++) roman=roman+romanLetters[12];
	 * roman=roman+romanLetters[8]; } }else { b=a/1; a=a%10; if(b==9)
	 * roman=roman+romanLetters[9]; else if(b==5) roman=roman+romanLetters[10]; else
	 * if(b==4) roman=roman+romanLetters[11]; else if(b==1)
	 * roman=roman+romanLetters[12]; else if(b>5) { roman=roman+romanLetters[10];
	 * for(int i=1;i<=b-5;i++) roman=roman+romanLetters[12];
	 * 
	 * } else if(b>1) { for(int i=1;i<=b;i++) roman=roman+romanLetters[12]; } } }
	 * System.out.println(roman); }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int Number = sc.nextInt();
		//romanNumber(Number);
		intToRoman(Number);
	}

}
