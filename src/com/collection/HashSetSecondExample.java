package com.collection;
import java.util.*;
public class HashSetSecondExample {
    private void hashSetConstructor() {
    	
    	
    	ArrayList<String> list1=new ArrayList<String>();
    	list1.add("java");
    	list1.add("Python");
    	list1.add("java");
    	
    	HashSet hs=new HashSet(list1); // each element treate as object duplicate value replace kar deta hai
    	System.out.println(hs);
    	
    	HashSet hs2=new HashSet(); // default constructor - capacity 16 and field ratio/load factor-0.75f
    	HashSet hs3=new HashSet(32); // constructor with initialcapacity 
    	HashSet hs4=new HashSet(20,0.80f); //constructor with initialcapacity and field ratio
    	/*
    	 * field ratio/load factor:-
    	 *        if default capacity 16 and field ratio is 0.75f when hashSet 12 field full then auto increase the capacity multiply by 2
    	 */
    }
    private void hashSetPratic() {
HashSet hs=new HashSet();
    	
    	ArrayList<String> list1=new ArrayList<String>();
    	list1.add("java");
    	list1.add("Python");
    	list1.add("java");
    	
    	ArrayList<Integer> list2=new ArrayList<Integer>();
    	list2.add(10);
    	list2.add(20);
    	list2.add(10);
    	
    	ArrayList<Integer> list3=new ArrayList<Integer>();
    	list3.add(10);
    	list3.add(20);
    	list3.add(10);
    	
    	ArrayList<Integer> list4=new ArrayList<Integer>();
    	list4.add(10);
    	list4.add(20);
    	list4.add(10);
    	list4.add(50);
    	
    	
    	hs.add(list1);
    	hs.add(list2);
    	hs.add(list3);  // same contains ko ek object ki traha trite karta hai or false return karta hai
    	hs.add(list4);
    	System.out.println(hs);
    	
    	// HashSet all methods
    }
	public static void main(String[] args) {
		HashSetSecondExample hsSecond=new HashSetSecondExample();
		hsSecond.hashSetConstructor();
	}

}
