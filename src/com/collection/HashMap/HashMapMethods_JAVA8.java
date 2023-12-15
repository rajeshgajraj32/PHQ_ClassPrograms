package com.collection.HashMap;

import java.util.HashMap;

public class HashMapMethods_JAVA8 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap();
		map.put(10, "Rajesh");
		map.put(11, "Mahesh");
		map.put(12, "Suresh");
		map.put(13, "Pukhraj");
		System.out.println(map);
		
		map.compute(10, (key,value) -> "Ramesh");
		System.out.println(map);
		map.compute(10, (key,value) -> value+" Mitharwal");
		System.out.println(map);
		map.compute(20, (key,value) -> "Ravinder");
		System.out.println(map);
		map.computeIfPresent(20, (key,value) -> "Lambora");
		map.computeIfPresent(15, (key,value) -> "Subhash Gajraj");
		System.out.println(map);
		map.computeIfAbsent(15, key -> "Pinky Mahariya");
		map.computeIfAbsent(15, key -> "Gopal Mitharwal");
		System.out.println(map);
	}

}
