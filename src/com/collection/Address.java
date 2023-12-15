package com.collection;

public class Address {
   String city;
   String state;
   Address(String city,String state){
	   this.city=city;
	   this.state=state;
   }
   public String toString() {
		  return "City:  "+city+" state: "+state;
	  }
}
