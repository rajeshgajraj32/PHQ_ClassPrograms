package com.collection;
import java.util.*;
public class ArraylistJoinLinkedlistQuestion {
    public void joinLinkedlist() {
    	//Creating a LinkedList
    	LinkedList<String> list=new LinkedList<String>();
    	//Adding elements at the end of the linkedList
    	list.add("ONE");
    	list.add("TWO");
    	list.add("THREE");
    	list.add("FOUR");
    	list.add("FIVE");
    	//Printing the elements of linkedList
    	System.out.println(list);  //Output : [ONE, TWO, THREE, FOUR, FIVE]
    	
    	//Creating an ArrayList
    	ArrayList<String> second=new ArrayList<String>();
    	//Adding elements at the end of the ArrayList
    	second.add("SIX");
    	second.add("SEVEN");
    	second.add("EIGHT");
    	second.add("NINE");
    	//Printing the elements of ArrayList
    	System.out.println(second); //Output : [SIX, SEVEN, EIGHT, NINE]
    	
    	//Appending arrayList at the end of linkedList
    	list.addAll(second);
    	//Printing the elements of linkedList
    	System.out.println(list);//Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]
    	
    	
    }
	public static void main(String[] args) {
		ArraylistJoinLinkedlistQuestion object=new ArraylistJoinLinkedlistQuestion();
		object.joinLinkedlist();

	}

}
