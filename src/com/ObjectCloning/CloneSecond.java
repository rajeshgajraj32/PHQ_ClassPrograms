package com.ObjectCloning;

public class CloneSecond implements Cloneable{
   int y;
   CloneThird ct;
   public CloneSecond(int i,CloneThird ct) {
	   y=i;
	   this.ct=ct;
	   
   }
   void showy() {
	   System.out.println(y);
   }
   protected Object clone()throws CloneNotSupportedException{
	   CloneThird ct2=new CloneThird(50);
	   CloneSecond cs2=new CloneSecond(24,ct2);
	   return cs2;
   }
}
