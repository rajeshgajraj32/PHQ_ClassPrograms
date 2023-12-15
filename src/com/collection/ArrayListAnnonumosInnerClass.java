package com.collection;

import java.util.*;

/*
  2) Using Anonymous inner class Method

create and initialize ArrayList with anonymous inner class calls
print the ArrayList

 */
public class ArrayListAnnonumosInnerClass {
	public void innerClass() {
		// create and initialize ArrayList with anonymous inner class calls
		ArrayList<Integer> list = new ArrayList<Integer>() {
			{
				add(100);
				add(200);
				add(300);
				add(400);
			}
		};
		// print the ArrayList
		System.out.println(list);

		// second method
		// create and initialize ArrayList with anonymous inner class calls
		ArrayList<Integer> secondlist = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		// print the ArrayList
		System.out.println(secondlist);
	}

	public static void main(String[] args) {
		ArrayListAnnonumosInnerClass object = new ArrayListAnnonumosInnerClass();
		object.innerClass();
	}

}
