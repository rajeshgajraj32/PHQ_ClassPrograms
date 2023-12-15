package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStoreObjectShortQuestion {
    static void objectShorting() {
         Comparator<Object> c=new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().length()<o2.toString().length() ? o1.toString().length()==o2.toString().length()? o1.toString().compareToIgnoreCase(o2.toString()):-1:1;
			}
    		
    	};
    	TreeSet tree=new TreeSet(c);
    	tree.add(new StringBuffer("A"));
    	tree.add(new StringBuffer("Z"));
    	tree.add("ABC");
    	tree.add("xxx");
    	tree.add("AA");
    	
    	System.out.println(tree);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectShorting();
	}

}
