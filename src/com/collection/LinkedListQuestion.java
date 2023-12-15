package com.collection;

import java.util.*;

public class LinkedListQuestion {
	public void replaceElements() {
		/*
		 * Que: 1) How do you replace an element at a specific position of a LinkedList
		 * with the given element? Notes: To replace an element at specific position of
		 * a LinkedList , use set() method.
		 * 
		 */
		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();
		// adding elements at the end of the list
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		// printing the element of list
		System.out.println(list); // output: [ONE, TWO, THREE, FOUR]
		// replacing an element at index 2 with "ZERO"
		list.set(2, "ZERO");
		// printing the element of list
		System.out.println(list); // output: [ONE, TWO, ZERO, FOUR]
	}

	public void getAndRemoveElement() {
		/*
		 * Que: 2) How do you retrieve and remove and only retrieve an element from
		 * specific position of a LinkedList? Notes You can use remove(int index) to
		 * retrieve and remove an element from specific position of a LinkedList. To
		 * only retrieve an element, ust get(int index) method.
		 * 
		 */
		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();
		// adding elements at the end of the list
		list.addLast("JAVA");
		list.addLast("J2EE");
		list.addLast("JSP");
		list.addLast("SERVLETS");
		list.addLast("JDBC");
		// printing the element of list
		System.out.println(list); // output: [JAVA, J2EE, JSP, SERVLETS, JDBC]
		// retrieving and removing an element at index 2 of the list
		System.out.println(list.remove(2)); // output: JSP
		// printing the element of list
		System.out.println(list); // output: [JAVA, J2EE, SERVLETS, JDBC]
		// Only retrieving an element at index 2 of the list
		System.out.println(list.get(2)); // output: SERVLETS
	}

	public void getLastElement() {
		/*
		 * Que: 3) How do you get the position of last occurrence of a given element in
		 * a LinkedList? Notes- Using lastIndexOf() method, we can retrieve the position
		 * of last occurrence of a given element in a LinkedList.
		 * 
		 */
		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();
		// adding elements at the end of the list
		list.addLast("AAA");
		list.addLast("BBB");
		list.addLast("CCC");
		list.addLast("BBB");
		list.addLast("FFF");
		list.add("BBB");
		// printing the element of list
		System.out.println(list); // output: [AAA, BBB, CCC, BBB, FFF, BBB]
		// Geting the last occurrence of "BBB"
		System.out.println(list.lastIndexOf("BBB")); // output: 5
	}

	public void cloneLinkedList() {
		/*
		 * Que: 4) How do you create clone of a LinkedList? Notes - Using clone() method
		 * of LinkedList class. This method creates shallow copy of the original
		 * LinkedList.
		 * 
		 */
		// create a LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();
		// adding elements at the end of the list
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		// printing the element of first linkedlist
		System.out.println(list); // output: [10, 20, 30, 40, 50]
		// create second LinkedList
		LinkedList<Integer> second = new LinkedList<Integer>();
		// cloning the linkedlist first into linkedlist second
		second = (LinkedList<Integer>) list.clone();
		// printing the element of second linkedlist
		System.out.println(second); // output: [10, 20, 30, 40, 50]
	}

	public void removeAllElement() {
		/*
		 * Que: 5) How do you remove all elements of a LinkedList? Notes - Using clear()
		 * method. This method removes all elements of a LinkedList.
		 * 
		 */
		// create a LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();
		// adding elements at the end of the list
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		// printing the element of list
		System.out.println(list); // output: [10, 20, 30, 40, 50]
		// Removing all elements of Linkedlist
		list.clear();
		// printing the element of list
		System.out.println(list); // output: []
	}

	public static void main(String[] args) {
		LinkedListQuestion object = new LinkedListQuestion();
		object.replaceElements();
		object.getAndRemoveElement();
		object.getLastElement();
		object.cloneLinkedList();
		object.removeAllElement();
	}

}
