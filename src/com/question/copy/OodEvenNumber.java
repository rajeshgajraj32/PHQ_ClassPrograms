package com.question.copy;
import java.util.*;
//write a java program to check Even-odd number without using if-else statement
public class OodEvenNumber {
     void usingSwitchStatement(int a) {
    	 switch(a%2){
    	 case 0:System.out.println("even number");
    	   break;
    	 case 1:System.out.println("odd number");
    	 }
     }
     void usingTernaryOperator(int a) {
    	 String st=(a%2==0)?"even number":"odd number";
    	 System.out.println(st);
    	 
     }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		OodEvenNumber oen =new OodEvenNumber();
		System.out.println("enter a number:");
		int a= sc.nextInt();
		oen.usingSwitchStatement(a);
		oen.usingTernaryOperator(a);
	}

}
