package com.collection;
import java.util.ArrayList;
import java.util.Collections;
class Student01 implements Comparable{
	int rollno;
	String s_name;
	public Student01(int rollno,String name) {
		this.rollno=rollno;
		s_name=name;
	}
	public String toString() {
		return "rollNumber="+rollno+" Name: "+s_name;
	}
	@Override
	public int compareTo(Object o) {
		Student01 s=(Student01)o;
		if(this.rollno>s.rollno)
		{
			return 1;
		}else if(this.rollno<s.rollno)
		{
			return -1;
		}else {
			return 0;
		}
		
	}
}
public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Student01(101,"rajesh"));
		list.add(new Student01(121,"birbal"));
		list.add(new Student01(102,"rajesh"));
		list.add(new Student01(101,"rajesh"));
		System.out.println(list);
		//Collections.sort(list,student01);
	}

}
