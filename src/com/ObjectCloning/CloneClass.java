package com.ObjectCloning;

public class CloneClass {

	public static void main(String[] args)throws CloneNotSupportedException  {
		CloneThird ct3=new CloneThird(200);
		CloneSecond d =new CloneSecond(100,ct3);
		
		System.out.println(d.y+"      "+d.ct.a);
		CloneSecond d3=(CloneSecond) d.clone();
		System.out.println(d3.y+"      "+d3.ct.a);
	}

}
