package com.collection;
import java.util.Stack;
public class StackExample {
    public void stackPratic() {
    	Stack<Integer> s=new Stack<Integer>();
    	s.push(10);
    	s.push(20);
    	s.push(30);
    	s.push(20);
    	s.push(40);
    	s.push(20);
    	
    	System.out.println(s);
    	System.out.println(s.pop());
    	
    	System.out.println(s.peek());
    	System.out.println(s);
    	
    	System.out.println(s.indexOf(10));
    	System.out.println(s.pop());
    	System.out.println(s.empty());
    	System.out.println(s.isEmpty());
    	// get method return specific index element
    	System.out.println(s.get(1));
    	System.out.println(s);
    	// search method return the offset of element
    	System.out.println(s.search(10));
    }
	public static void main(String[] args) {
		StackExample stackObj=new StackExample();
		stackObj.stackPratic();
	}

}
