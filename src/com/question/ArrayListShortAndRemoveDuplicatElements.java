package com.question;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListShortAndRemoveDuplicatElements {
	// create an ArrayList and short this and remove all duplicate Elements
    static void result() {
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(2);
    	list.add(2);

    	list.add(1);
    	list.add(3);
    	list.add(1);
    	list.add(2);
    	list.add(1);
    	list.add(5);
    	list.add(7);
    	list.add(7);
    	Collections.sort(list);
    	System.out.println(list);
    	for(int i=0;i<list.size()-1;i++) {
    		while(i+1<list.size()&&(list.get(i)==list.get(i+1))) {
    			list.remove(i+1);
    		}
    	}
    	System.out.println(list);
    }    
	public static void main(String[] args) {
        result();
	}

}
