package com.cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorCursor {
    
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(1000);
        // Iterator :-
		Iterator<Integer> itr=list.iterator();
        // iterate by using forEachRemaining method
		itr.forEachRemaining(number -> System.out.println(number));

		while(itr.hasNext()) {
			if(itr.next()==100)
			{
				itr.remove();
			}
			//itr.add(1111);  //compile time error because iteration and updation both work not together
			//System.out.println(itr.next());
		}
		System.out.println(list);
		
		
		
	}

}
