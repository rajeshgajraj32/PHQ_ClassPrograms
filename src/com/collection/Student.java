package com.collection;

import java.util.ArrayList;

public class Student {
  int id;
  String name;
  Address address;
  public Student(int id,String name,Address address){
	  this.id=id;
	  this.name=name;
	  this.address=address;
  }
  public String toString() {
	  return " id: "+id+" Name: "+name+" Address: "+address+" ";
  }
}
