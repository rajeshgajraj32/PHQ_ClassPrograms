package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetExample {
	public int hashString(String example) {
		int total=0;
		for(int i=0;i<example.length();i++) {
			total+=(int)example.charAt(i);
		}
		return total%10;
	}
    protected void hashsetPratics() {
    	HashSet hs=new HashSet();
    	// values store as a key and values store Present
    	hs.add(10);
    	hs.add('c');
    	hs.add(10.0);
    	hs.add(10.0f);
    	hs.add("hashset");
    	System.out.println(hs);
    	System.out.println(hs.add(10));
    	System.out.println(hs.add("java"));
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	list.add(10);
    	System.out.println(hs);
    	
    }
	public static void main(String[] args) {
		HashSetExample he=new HashSetExample();
		he.hashsetPratics();
		
		String exampleString="example";
		int hashValue=he.hashString(exampleString);
		System.out.println("Hashed Value of "+exampleString+":"+hashValue);
		
	}

}
