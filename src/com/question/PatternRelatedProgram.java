package com.question;

public class PatternRelatedProgram {
	/*
	 ----1
     ---22
     --3=3
     -4==4
     5===5
	 */
    static void pattern() {
    	int size=10;
    	for(int i=1;i<size;i++) {
    		for(int j=1;j<size;j++) {
    			if(j==size-i||j==size-1) {
    				System.out.print(i);
    			}else if(j<size-i) {
    			System.out.print("-");
    			}else {
    				System.out.print("=");
    			}
    		}
    		System.out.println();
    	}
    	System.out.println("----------second Pattern----------");
    }
    
    /*
     ----1
     ---212a
     --32123
     -4321234
     543212345
     */
    
    static void patternSecond() {
    	int size=10;
    	for(int i=1;i<size;i++) {
    		for(int j=1;j<size+i-1;j++) {
    			if(j>=size-i&&j<size) {
    				System.out.print(size-j);
    			}else if(j>size-1) {
    			System.out.print(j-size+2);
    			}else {
    				System.out.print("-");
    			}
    		}
    		System.out.println();
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern();
		patternSecond();
	}

}
