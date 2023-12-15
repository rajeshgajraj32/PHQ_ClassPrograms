package com.question;
import java.util.ArrayList;
public class StringAllPosibalPairs {
	static StringAllPosibalPairs object=new StringAllPosibalPairs();
	static int round=0;
	static String temp="",second="";
	static ArrayList<String> list=new ArrayList<String>();
	static final String name="abc";
    public void pairs(int num) {
    	String distPair="";
    	for(int i=round;i<name.length();i++) {
    		round++;
    		while(round<name.length()){
        		object.pairs(round);
        	}
    		temp=temp+String.valueOf(name.charAt(i));
    		list.add(temp);
    	}
		temp="";
    }
	public static void main(String[] args) {
		//StringAllPosibalPairs object=new StringAllPosibalPairs();
		object.pairs(round);
		System.out.println(list);

	}

}
