package com.collection;
import java.util.*;
public class FruitLinkedListReplaceQuestion {
    public void replaceFruitName() {
    	Scanner sc=new Scanner(System.in);
    	LinkedList<String> fruitList=new LinkedList<String>();
    	System.out.println("Enter five fruits name: ");
    	for(int i=1;i<=5;i++) {
    		fruitList.add(sc.nextLine());
    	}
    	System.out.println("Find fruit Name:");
    	String findfruit=sc.nextLine();
    	System.out.println("replace fruit Name:");
    	String replacefruit=sc.nextLine();
    	boolean flag=false;
    	ListIterator<String> li=fruitList.listIterator();
    	while(li.hasNext()) {
    		if(li.next().equals(findfruit)) {
    			li.set(replacefruit);
    			flag=true;
    		}
    	}
    	if(flag) {
    		System.out.println(fruitList);
    	}else {
    		System.out.println("Fruit not found in this list");
    	}
    	
    }
	public static void main(String[] args) {
		FruitLinkedListReplaceQuestion obj=new FruitLinkedListReplaceQuestion();
		obj.replaceFruitName();

	}

}
