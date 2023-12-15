package com.collection;
import java.util.*;
public class HashSetQuestionExample {

	public static void main(String[] args) {
		Student s1=new Student(1, "rajesh",new Address("chala","neemkathana"));
		Student s2=new Student(2, "mahesh",new Address("chala","neemkathana"));
		Student s3=new Student(3, "sandeep",new Address("gomawali","shrimadhopur"));
		Student s4=new Student(4, "birbal",new Address("bawari","jodhpur"));
		
		HashSet<Object> set=new HashSet<Object>();
		System.out.println(set);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
	}

}
