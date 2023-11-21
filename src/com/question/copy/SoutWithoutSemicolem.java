package com.question.copy;
import java.lang.*;
//write a java program for print string without using semicolem
public class SoutWithoutSemicolem {
    void sout() {
    	if((System.out.printf("Hello world"))==null) {
          }
    }
    public void usingAppendMethod() {
    	if(System.out.append("hello world")==null) {
    		
    	}
	}
    void usingEqualMethod() {
    	if(System.out.append("hello world").equals(null)) {
    		
    	}
    }
	
	public static void main(String[] args) {
		SoutWithoutSemicolem sws= new SoutWithoutSemicolem();
		sws.sout();
		sws.usingAppendMethod();
		sws.usingEqualMethod();

	}

}
