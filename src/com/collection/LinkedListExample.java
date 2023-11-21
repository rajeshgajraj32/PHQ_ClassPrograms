package com.collection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkedListExample {
    static void normalUse() {
    	LinkedList<Integer> list1=new LinkedList<Integer>();
    	list1.add(10);
    	list1.add(20);
    	list1.add(30);
    	list1.add(40);
    	
    	LinkedList list2=new LinkedList(list1);
    	System.out.println(list2);
    	System.out.println(list1);
    	ArrayList list3=new ArrayList(list1);
    	list3.add("rajesh gajraj");
    	list3.add("jai veer hanuman");
    	list1.addAll(list3);
    	System.out.println(list1);
    	
    }
    static void methodsOfLinkedList() {
    	LinkedList<Integer> list1=new LinkedList<Integer>();
    	list1.add(10);
    	list1.add(20);
    	
    	LinkedList list2=new LinkedList(list1);
    	list2.add("rajesh gajraj");
    	list2.add("jai veer hanuman");
    	
    	list1.add(2, null);
    	list1.addFirst(null);
    	list1.addLast(1100);
    	list1.add(null);
    	//list1.clear();
    	list2=(LinkedList) list1.clone();
    	//System.out.println(list2);
    	System.out.println(list1.contains(null));
    	// contain method return true because list1 clone by using clone method in list2
    	System.out.println(list1.containsAll(list2));
    	Iterator itr=list1.descendingIterator();
    	while(itr.hasNext()) {
    		System.out.print(itr.next()+" ");
    	}
    	System.out.println();
    	list1.addFirst(55);
    	System.out.println(list1);
    	// element method return first element from LinkedList
    	System.out.println(list1.element());
    	list1.forEach(System.out::println);
    	// get method in LinkedList return the specific index element
    	System.out.println(list1.get(0));
    	// getFirst method return first element of LinkedList
    	System.out.println(list1.getFirst());
    	// getLast method return Last element of LinkedList
    	System.out.println(list1.getLast());
    	// hashCode method return the hashcode of LinkedList
    	System.out.println(list1.hashCode());
    	// indexOf method return the first index of specific element
    	System.out.println(list1.indexOf(null));
    	// isEmpty method return true if LinkedList is empty else return false
    	System.out.println(list1.isEmpty());
    	// lastIndexOf method return specific element's lastIndex
    	System.out.println(list1.lastIndexOf(null));
    	// offer method as well as add method without specific index value --> jo value pass karte hai us ko LinkedList k last ma jod deat hai
    	System.out.println(list1.offer(55));
    	// offerFirst method Inserts the specified element at the front of this list.
    	System.out.println(list1.offerFirst(540));
    	// offerLast method Inserts the specified element at the end of this list.
    	System.out.println(list1.offerLast(242));
    	
    	System.out.println(list1.remove(1100));
    	System.out.println(list2.toArray());
    	System.out.println(list1);
    }
	public static void main(String[] args) {
		//normalUse();
		methodsOfLinkedList();

	}

}
