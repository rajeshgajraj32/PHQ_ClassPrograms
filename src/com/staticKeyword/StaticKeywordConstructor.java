package com.staticKeyword;

public class StaticKeywordConstructor {
    static int a=0;
    int b=1;
    StaticKeywordConstructor(){
    	a++;
    	b++;
    	System.out.println(a+" "+b);
    }
	public static void main(String[] args) {
		StaticKeywordConstructor s1=new StaticKeywordConstructor();
		StaticKeywordConstructor s2=new StaticKeywordConstructor();
		StaticKeywordConstructor s3=new StaticKeywordConstructor();
	}

}
