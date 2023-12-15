package com.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorCursor {
    static void listIterate() {
    	ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(1000);
		
    	// ListIterator:-
    			ListIterator<Integer> lit=list.listIterator();
    			while(lit.hasNext()) {
    				lit.add(0);
    				System.out.println(lit.next());
    			}
    			System.out.println("-----------------");
    			while(lit.hasPrevious()) {
    				lit.set(500);
    				System.out.println(lit.previous());
    			}
    }
	public static void main(String[] args) {
		listIterate();

	}

}
