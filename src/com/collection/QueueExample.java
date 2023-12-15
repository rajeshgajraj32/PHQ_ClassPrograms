package com.collection;
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public void queuePratics() {
    	Queue q=new LinkedList<String>();
    	q.add("shri ram");
    	q.add(null);
    	q.addAll(q);
    	q.offer("rajesh gajraj");
    	q.offer("rajesh gajraj");
    	System.out.println(q);
    	System.out.println("Poll return: "+q.poll());
    	System.out.println("peek return: "+q.peek());
    	
    	System.out.println("remove :"+q.remove());
    	System.out.println(q);
    	System.out.println("element : "+q.element());
    	System.out.println(q);
    	/*
    	 * if we want to throw exception when queue has element
    	 * q.remove():
    	 * if(q.size()){
    	 * throw new NoSuchElementException("no such element "):
    	 * }
    	 */
    	while(true){
    		System.out.println(q.poll());
    		q.remove();
    	}
        
    }
	public static void main(String[] args) {
		QueueExample obj =new QueueExample();
		obj.queuePratics();
	}

}
