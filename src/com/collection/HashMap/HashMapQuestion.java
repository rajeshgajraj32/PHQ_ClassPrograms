package com.collection.HashMap;

import java.util.HashMap;

public class HashMapQuestion {
	public static void hashMapPutAll() {
		/*
		 * Question: 1. How do you add key-value pairs to HashMap? Notes :- using put()
		 * and putAll() methods. put() method adds key-value pair one by one where as
		 * putAll() method copies all key-value pairs from one HashMap to another
		 * HashMap.
		 */
		HashMap<String, Integer> mapFrist = new HashMap();
		mapFrist.put("first", 1);
		mapFrist.put("second", 2);
		mapFrist.put("Third", 3);
		mapFrist.put("Fourth", 4);
		System.out.println(mapFrist);

		HashMap<String, Integer> mapSecond = new HashMap();
		mapSecond.put("Five", 5);
		mapSecond.put("six", 6);
		mapSecond.put("Seven", 7);
		mapSecond.put("Eight", 8);
		System.out.println(mapSecond);

		mapFrist.putAll(mapSecond);
		System.out.println(mapFrist);
	}
    public static void putIfNotPersent() {
    	HashMap<String, Integer> mapFrist = new HashMap();
		mapFrist.put("ONE", 1);
		mapFrist.put("TWO", 2);
		mapFrist.put("THREE", 3);
		mapFrist.put("FOUR", 4);
		System.out.println(mapFrist);
		
		mapFrist.putIfAbsent("ONE", 111);
		mapFrist.putIfAbsent("FIVE", 5);
		System.out.println(mapFrist);
    }
    public static void getValueUsingGetMthod() {
    	HashMap<String, Integer> mapFrist = new HashMap();
		mapFrist.put("ONE", 1);
		mapFrist.put("TWO", 2);
		mapFrist.put("THREE", 3);
		mapFrist.put("FOUR", 4);
		System.out.println(mapFrist);
		System.out.println(mapFrist.get("TWO"));
    }
    public static void checkKeyAndValueContain() {
    	HashMap<Integer,Float> mapFrist = new HashMap();
    	mapFrist.put(1, 1.10f);
    	mapFrist.put(2, 2.20f);
    	mapFrist.put(3, 3.30f);
    	mapFrist.put(4, 4.40f);
    	
    	System.out.println(mapFrist.containsKey(2));
    	System.out.println(mapFrist.containsValue(4.40f));
    }
	public static void main(String[] args) {
		hashMapPutAll();
		putIfNotPersent();
		getValueUsingGetMthod();
		checkKeyAndValueContain();
	}

}
