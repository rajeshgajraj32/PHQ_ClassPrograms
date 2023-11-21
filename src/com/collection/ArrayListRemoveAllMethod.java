package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllMethod {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("rajesh");
		list.add('A');
		System.out.println(list);
		list.stream().forEach(System.out::println);
		
		// with Generic
		List<String> list1 = new ArrayList<String>();
		list1.add("rajesh");
		list1.add("sanjay samota");
		list1.add("dheeraj choudhary");
		list1.stream().forEach(System.out::println);
		list1.addAll(list);
		 System.out.println(list1);
		 
		list1.removeAll(list);
		// removeAll method list k sabhi elements ko list1 se hata dega chahiya wo element list1 me already ho
		System.out.println(list1);
		

	}

}
