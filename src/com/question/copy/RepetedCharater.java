package com.question.copy;
import java.util.*;
public class RepetedCharater {
    public void repetChar(String s) {
    	int j,count=1;
    	for(int i=0;i<s.length();) {
    		j=i+1;
    		
    		while((j<s.length()&&s.charAt(i)==s.charAt(j))) {
    			count++;
    			j++;
    		}
    		
    		System.out.print(s.charAt(i)+""+count);
    		i=j;
    		count=1;
    		}
    	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
        String s=sc.next();
        RepetedCharater rc= new RepetedCharater();
        rc.repetChar(s);
        
	}

}
