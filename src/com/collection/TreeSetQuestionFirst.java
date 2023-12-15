package com.collection;
import java.util.*;
public class TreeSetQuestionFirst {
    int id;
	public void reverseTreeSet() {
		int id;
		Comparator<String> c=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				
				return -(o1.compareToIgnoreCase(o2));
			}
		};
		TreeSet<String> tree=new TreeSet<String>(c);
		tree.add("Roja");
		tree.add("SobhaRani");
		tree.add("Rajkumari");
		tree.add("GangaBhawani");
		tree.add("Ramulal");
		System.out.println(tree);
	}
	public static void main(String[] args) {
		int id;
		TreeSetQuestionFirst object=new TreeSetQuestionFirst();
		object.reverseTreeSet();
	}

}
