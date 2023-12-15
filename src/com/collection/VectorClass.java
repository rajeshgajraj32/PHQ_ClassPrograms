package com.collection;
import java.util.Vector;
import java.util.ArrayList;
public class VectorClass {
    public void vectorClassMethods() {
    	Vector<Integer> first=new Vector<Integer>(); // default capacity =10
    	first.add(100);
    	first.add(200);
    	first.add(300);
    	System.out.println(first);
    	// vector class method -- add the element at the end of vector
    	first.addElement(500);
    	System.out.println(first);
    	// firstElement method return the first element of vector
    	System.out.println(first.firstElement());
    	// lastElement method return the last element of vector
    	System.out.println(first.lastElement());
    	//removeElement return true if passing element are persent in vector and remove this element in the vector
    	System.out.println(first.removeElement(200));
    	// removeElementAt method used for remove the element at the specific index
    	first.removeElementAt(2);
    	//removeAllElements method use for remove all elements from vector
    	//first.removeAllElements();
    	System.out.println(first.capacity());
    	System.out.println(first);
    	// setElementAt method us for replace element at specific index
    	first.setElementAt(200,0);
    	// size method return size of vector
    	System.out.println(first.size());
    	// indexof method return the index of specific element if element not found return -1
    	System.out.println(first.indexOf(200));
    	first.add(300);
    	first.add(400);
    	first.add(300);
    	// indexOf method return the index of element from the specific index 
    	System.out.println(first.indexOf(300, 3));
    	Object[] arr=new Object[20];
    	first.copyInto(arr);
    	System.out.println(arr[0]);
    	
    	System.out.println(first);
    }
    public void vectorExample() {
    	Vector<Integer> first=new Vector<Integer>();
    	first.add(100);
    	first.add(200);
    	first.add(300);
    	System.out.println(first);
    	
    	Vector<String> second =new Vector<String>();
    	second.add("rajesh choudhary");
    	//second.add(first);   //compile time error
    	
    	Vector third =new Vector();
    	third.add(first);
    	third.add(second);
    	System.out.println(third);
    }
    private void vectorConstructor() {
    	Vector v =new Vector();  //first constructor and default assigned capacity is 10
    	System.out.println(v.capacity());
    	
    	Vector v2=new Vector(7);  //second constructor and assigned capacity is 7
    	System.out.println(v2.capacity());
    	
    	Vector v3=new Vector(2,3);  // third constuctor and assigned capacity is 2 and then increment currentcapacity + assigned
    	System.out.println(v3.capacity());
    	
    	ArrayList list =new ArrayList();
    	list.add(10);
    	list.add(20);
    	
    	Vector v4=new Vector(list);  // fourth  constructor and default capacity is 10 and then collection passing in constructor add in vector
    	System.out.println(v4.capacity());
    }
	public static void main(String[] args) {
		VectorClass v = new VectorClass();
		//v.vectorConstructor();
		//v.vectorExample();
		v.vectorClassMethods();

	}

}
