package com.collection;
import java.util.*;
class ComparatorCreate implements Comparator<String>{
	public int compare(String str1,String str2) {
		if(str1.length()<str2.length())
			return 1;
		else
			return -1;
	}
}
public class PriorityQueueExample {

	public static void main(String[] args) {
		TreeSet tree =new TreeSet();
		tree.add("ramesh");
		tree.add("amit");
		tree.add("suresh");
		tree.add("gopal");
		tree.add("mahesh");
		//PriorityQueue pq=new PriorityQueue(tree);
		PriorityQueue pq=new PriorityQueue(new ComparatorCreate());
		System.out.println(pq);
		  pq.add("ramesh");
          pq.add("amit"); 
          pq.add("suresh"); 
		  pq.add("gopal");
		  pq.add("mahesh");
		  
		  
		  //pq.add(10);  // throw :- java.lang.ClassCastException
		  System.out.println(pq);
		  //pq.add(null);  // throw :- java.lang.NullPointerException
		  System.out.println(pq);
	}

}
