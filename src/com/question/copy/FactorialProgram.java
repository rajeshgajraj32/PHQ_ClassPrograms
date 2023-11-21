package com.question.copy;

import java.util.Scanner;

public class FactorialProgram {
    public int fact(int num) {
    	if(num>0) {
    		return num*fact(num-1);
    	}else {
    		return 1;
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
        int num=sc.nextInt();
        FactorialProgram rc= new FactorialProgram();
        System.out.println(rc.fact(num));

	}

}
