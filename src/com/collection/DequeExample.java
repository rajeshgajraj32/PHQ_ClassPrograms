package com.collection;
import java.util.*;
public class DequeExample {
    public void dequeConvertIntoArray() {
    	Deque dq=new ArrayDeque();
		dq.addFirst(5);
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addLast(30);
		dq.addLast(40);
		System.out.println(dq.toArray());
		Object[] arrayObjects= dq.toArray();
		
		//Object[] arrayObjects1=dq.toArray(arrayObjects);
		for(Object obj:arrayObjects)
			System.out.println(obj);
		
		Spliterator sp=dq.spliterator();
		sp.forEachRemaining(System.out::print);
    }
	public static void main(String[] args) {
		Deque dq=new ArrayDeque();
		dq.addFirst(5);
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addLast(30);
		dq.addLast(40);
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		dq.add(100);
		dq.add(200);
		dq.add(300);
		dq.add(300);
		
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		
		// create calss object
		DequeExample classObject=new DequeExample();
		classObject.dequeConvertIntoArray();
	}

}
