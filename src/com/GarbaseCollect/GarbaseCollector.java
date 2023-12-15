package com.GarbaseCollect;

public class GarbaseCollector {
    
	public static void main(String[] args) {
		GarbaseCollector object01 =new GarbaseCollector();
		GarbaseCollector object02 =new GarbaseCollector();
		object01=null;
		object02=null;
		System.gc();
	}

}
