package com.collection;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseTheLinkedList {
	// reverse the linkedlist
    static void reverseLinkedList() {
    	LinkedList list=new LinkedList();
    	list.add(100);
    	list.add("Rajes");
    	list.add('c');
    	System.out.println(list);
    	Collections.reverse(list);
    	System.out.println(list);
     }
    // check the string that the string is palandrom are not
    static String plandromString() {
    	String str="abcdcbaa";
    	for(int i=0;i<(str.length()/2);i++) {
    		if(str.charAt((str.length()-1)-i)!=str.charAt(i)){
    			return "this string is not palandrom";
    		}
    	}
    	return "this string is palandrom";
    }
    
	public static void main(String[] args) {
		reverseLinkedList();
		System.out.println(plandromString());
	}

}
