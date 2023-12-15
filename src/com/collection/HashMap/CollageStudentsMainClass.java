package com.collection.HashMap;

import java.util.HashMap;

public class CollageStudentsMainClass {

	public static void main(String[] args) {
		CollageStudents s1=new CollageStudents(1, "Amichand");
		CollageStudents s2=new CollageStudents(2, "Neeraj");
		CollageStudents s3=new CollageStudents(3, "Mahaveer");
		CollageStudents s4=new CollageStudents(4, "Avinash");
		CollageStudents s5=new CollageStudents(5, "Bhajchand");
		HashMap<Integer,CollageStudents> map=new HashMap();
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		System.out.println(map);
		System.out.println("-------------------------");
		CollageStudents s6=new CollageStudents(3, "Rajesh");
		CollageStudents s7=new CollageStudents(5, "Baldev");
		map.put(s6.getId(), s6);
		map.put(s7.getId(), s7);
		System.out.println(map);
	}

}
