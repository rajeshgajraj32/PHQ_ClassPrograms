package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStoreStringBufferObject {
    public static void sortingOfStringBuffer() {
    	Comparator<StringBuffer> c=new Comparator<StringBuffer>() {
    		
			public int compare(StringBuffer o1, StringBuffer o2) {
				// TODO Auto-generated method stub
				return o1.toString().compareToIgnoreCase(o2.toString());
			}
    		
    	};
    	TreeSet<StringBuffer> tree=new TreeSet<StringBuffer>(c);
    	tree.add(new StringBuffer("A"));
    	tree.add(new StringBuffer("Z"));
    	tree.add(new StringBuffer("K"));
    	tree.add(new StringBuffer("L"));
    	System.out.println(tree);
    	
    }
	public static void main(String[] args) {
		sortingOfStringBuffer();
	}

}
