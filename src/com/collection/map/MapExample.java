package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		MapExample map=new MapExample();
		//map.mapPratics();
		map.withGenericMap();
	}

	private void withGenericMap() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"first");
		map.put(2, "second");
		map.put(null, null);
		map.put(4,null);
		
		map.put(2, null);
		
		System.out.println(map);
		
		//Set set=map.entrySet();
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();

		System.out.println(map.hashCode());
		System.out.println(set.hashCode());
		System.out.println(set.equals(map.entrySet()));
		System.out.println(set.equals(set1));
		System.out.println(set==set1);
	}

	private void mapPratics() {
		// non-generic map 
		Map map=new HashMap();
		map.put("first", 1);
		map.put(2, "second");
		map.put('c', 10.1);
		map.put("fourth", "four");
		map.put(null, null);
		map.put(null, 500);
		map.put(null, 300);
		map.put(2, null);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue(1));
		
		Set s=map.entrySet();
		System.out.println(s);
		
		Map map2=map;
		System.out.println(map.equals(map2));
		
		// forEach iterate
		map.forEach((key,value)-> System.out.println(key+" "+value));
		
		System.out.println(map.get(null));
		System.out.println(map.getOrDefault("first", 1100));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		map.putAll(map2);
		map.putIfAbsent('c',22);
		map.putIfAbsent('d',44);
		System.out.println(map);
		map.remove('d');
		map.remove('c', 22);
		System.out.println(map);
		map.replace('c', "replace");
		System.out.println(map.size());
		System.out.println(map.values());
	}

}
