package com.collection.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
    static void hashMap() {
    	HashMap<Integer,String> map=new HashMap();
    	map.put(51, "Hindi");
    	map.put(55, "Mathmatic");
    	map.put(52, "English");
    	map.put(53, "Science");
    	map.put(56, "Reasoning");
    	System.out.println("________First_________");
    	System.out.println(map);
    	
    	
    	System.out.println("________second_________");
    	map.forEach((Key1,Value1)->System.out.println(Key1+" -> "+Value1));
    	
    	
    	System.out.println("________Thrid_________");
    	Set set=map.entrySet();
    	Iterator itr=set.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    	
    	
    	System.out.println("________Fourth_________");
    	Set setSecond=map.entrySet();
    	Iterator itrSecond=setSecond.iterator();
    	while(itrSecond.hasNext()) {
    		Map.Entry<Integer, String> entry=(Map.Entry)itrSecond.next();
    		Integer key=entry.getKey();
    		String value=entry.getValue();
    		System.out.println(key+" --> "+value);
    	}
    	
    	
    	System.out.println("________Five_________");
    	Set s=map.entrySet();
    	for(Object s1:s) {
    		System.out.println(s1);
    	}
    	
    	System.out.println("________Six_________");
    	Set<Map.Entry<Integer, String>> set02=map.entrySet();
    	for(Map.Entry<Integer, String> map1:set02) {
    		System.out.println(map1);
    	}
    	
    	System.out.println("________Seven_________");
    	for(Map.Entry<Integer, String> map1:map.entrySet()) {
    		System.out.println(map1);
    	}
    	
    	System.out.println("________Eight_________");
    	Set<Integer> i=map.keySet();
    	for(Integer key:i) {
    		System.out.println(key+" "+map.get(key));
    	}
    	
    	System.out.println("________Nine_________");
    	Collection<String> list=map.values();
    	for(String s1:list) {
    		System.out.println(s1);
    	}
    }
	public static void main(String[] args) {
		hashMap();
	}

}
