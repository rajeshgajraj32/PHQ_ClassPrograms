package com.InheritanceExample;

public class A {
     double a,b,c;
     A(){
    	 System.out.println("Welcome in class A --> 0 argument constructor");
     }
     A(double i){
    	 a=3.14*(i*i);
    	 System.out.println("circle area is :"+a);
    	 
     }
     A(double i,double j){
    	 a=i*j;
    	 System.out.println("rectangle area is :"+a);
    	 
     }
     A(double i,double j,double k){
    	 b=(i+j+k)/3;
    	 c=b*(b-i)*(b-j)*(b-k);
    	 a=Math.sqrt(c);
    	 System.out.println("Triangle area is :"+a);
    	 
     }
}
