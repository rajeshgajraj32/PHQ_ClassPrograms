package com.collection;

import java.util.ArrayList;

public class InserMoreThenOneElementArrayList {
    static void inserElement() {
    	//Creating a ArrayList
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	//Adding elements at the end of the ArrayList
    	list.add(111);
    	list.add(222);
    	list.add(333);
    	list.add(444);
    	//Printing the elements of ArrayList
    	System.out.println(list); //Output :  [111, 222, 333, 444]
    	 //Creating an ArrayList
    	ArrayList<Integer> secondlist=new ArrayList<Integer>();
    	//Adding elements at the end of the ArrayList
    	secondlist.add(555);
    	secondlist.add(666);
    	secondlist.add(777);
    	secondlist.add(888);
    	list.addAll(0,secondlist);
    	System.out.println(list);
    	
    }
	public static void main(String[] args) {
		inserElement();
	}

}
