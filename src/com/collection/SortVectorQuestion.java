package com.collection;
import java.util.Collections;
import java.util.Vector;
public class SortVectorQuestion {
    static void sortVector() {
    	//Create First  vector 
    	Vector<Integer> vector = new Vector<Integer>();
    	//Add elements to the vector 
    	vector.add(1);
    	vector.add(11);
    	vector.add(7);
    	vector.add(3);
    	vector.add(5);
    	//print the vector elements 
    	System.out.println(vector); //Output : Vector Elements: [1, 11, 7, 3, 5] 
    	
    	//sort vector using Collections.sort method
    	Collections.sort(vector);
    	//print sorted vector 
    	System.out.println(vector);//  Vector Element safter sorting: [1, 3, 5, 7, 11]
    }
	public static void main(String[] args) {
		sortVector();
	}

}
