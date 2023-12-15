package com.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    static void retrive() {
    	Vector<Integer> vector= new Vector<Integer>();
    	vector.add(12);
    	vector.add(24);
    	vector.add(36);
    	vector.add(48);
    	
    	Enumeration<Integer> e=vector.elements();
    	while(e.hasMoreElements()) {
    		System.out.println(e.nextElement());
    	}
    	
    	System.out.println("-------second excricize---only pratics----");
    	ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(1000);
		Enumeration<Integer> enu=Collections.enumeration(list);
		while(enu.hasMoreElements()) {
    		System.out.println(enu.nextElement());
    	}
    }
	public static void main(String[] args) {
		retrive();
	}

}
