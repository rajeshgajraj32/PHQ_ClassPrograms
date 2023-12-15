package com.collection;

import java.util.ArrayList;

public class CheckElementPersentArraylist {
    static void checkElement() {
    	//Creating a ArrayList in Double type
    	ArrayList<Double> list=new ArrayList<Double>();
    	//Adding elements at the end of the ArrayList
    	list.add(1.1);
    	list.add(11.11);
    	list.add(111.111);
    	list.add(1111.1111);
    	//Printing the elements of ArrayList
    	System.out.println(list); // Output -  [1.1, 11.11, 111.111, 1111.1111]
    	//Checking whether list conatins '111.1111'
    	System.out.println(list.contains(111.1111)); //Output : false
    }
	public static void main(String[] args) {
		checkElement();
	}

}
