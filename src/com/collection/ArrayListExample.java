package com.collection;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayListExample {
	static void ArrayListAllMethodsPratics() {
		// without Generic
				ArrayList list = new ArrayList();
				list.add(10);
				list.add("rajesh");
				list.add('A');
				list.add("shri ram");
				System.out.println(list);
				list.stream().forEach(System.out::println);
				
				// with Generic
				ArrayList<String> list1 = new ArrayList<String>();
				// e method can be used to increase the capacity of ArrayList object manually
				list1.ensureCapacity(5);
				list1.add("rajesh gajraj");
				list1.add("sanjay samota");
				list1.add("dheeraj choudhary");

				list1.stream().forEach(System.out::print);
				System.out.println();
				// sort the Arraylist this way
				Collections.sort(list1);
				list1.stream().forEach(System.out::println);
				list1.add(3, "ram");
				System.out.println(list1);
				
				list1.addAll(0,list);
				System.out.println(list1);
				
				System.out.println(list1.contains(10));
				System.out.println(list1.containsAll(list));
				System.out.println(list1.equals(list));
				System.out.println(list1.get(5));
				System.out.println(list1.hashCode());
				
				list1.add(1,"police headquarters");
				System.out.println(list1.indexOf("rajesh"));
				list1.remove(1);
				list1.remove(new String("shri ram"));
				System.out.println(list1);
				
				//list1.remove("rajesh");
				System.out.println(list1.get(1));
				System.out.println(list1.getClass());
				System.out.println(list1.isEmpty());
				
				list1.retainAll(list);
				System.out.println(list1);
				list1.set(0, "suresh modi");
				System.out.println(list1);
				list1.stream();
				System.out.println(list1);
				//Collections.sort(list1);
				System.out.println(list1);
				System.out.println(list1.subList(0, 2));
				
	}
   static void listIteratorMethods() {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(10);
    	list.add(20);
    	list.add(null);
    	list.add(10);
    	list.add(null);
    	list.add(5,54);
    	
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
    	list2.add(10);
    	list2.add(200);
    	//(1)
        System.out.println(list);
        
      //(2)
        System.out.println("--------------------");
        for(Integer i:list) {
        	System.out.println(i);
        }
        
      //(3)
        System.out.println("--------------------");
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        
      //(4)
        System.out.println("--------------------");
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
      //(5)
        
        System.out.println("--------------------");
        list.forEach(System.out::println);
        
      //(5)
       list.removeAll(list2);
        System.out.println("-----------6---------");
        list2.stream().forEach(System.out::println);
    }
   static void arrayListImport() {
	   
	   //1. compile time error because ArrayList is a specifice type 
	  /* ArrayList<Integer> list1=new ArrayList<Integer>();
	   list1.add(10);
	   
	   ArrayList<String> list2=new ArrayList<String>();
	   list2.add("rajesh");
	   list2.add(list1);
	   */
	   
	   //2. compile time error because ArrayList is a specifice type 
	   /*
	   ArrayList<Integer> list3=new ArrayList<>();
	   list3.add(10);
	   
	   ArrayList<String> list4=new ArrayList();
	   list4.add("rajesh");
	   list4.add(list3);
	   list3.add(list4);
	   */
	   
	   //3. No compile time error because ArrayList is not a specifice type 
	   
	   ArrayList list5=new ArrayList<>();
	   list5.add(10);
	   
	   ArrayList<String> list6=new ArrayList();
	   list6.add("rajesh");
	   list5.add(list6);
	   
   }
	public static void main(String[] args) {
		ArrayListAllMethodsPratics();
		listIteratorMethods();
	}

}
