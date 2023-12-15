package com.collection;
import java.util.*;
class Employees{
	private int emp_id;
	private String name;
	public void setId(int id) {
		emp_id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		
		return "Employee Id:"+emp_id+" Employee Name: "+name+"\n";
	}
	
}
public class TreeSetShortSelf {

	public static void main(String[] args) {
		Employees emp1=new Employees();
		emp1.setId(1001);
		emp1.setName("Rajesh");
		Employees emp2=new Employees();
		emp2.setId(1002);
		emp2.setName("Amesh");
		Employees emp3=new Employees();
		emp3.setId(1005);
		emp3.setName("rajesh");
		Employees emp4=new Employees();
		emp4.setId(1004);
		emp4.setName("birbal");
		Employees emp5=new Employees();
		emp5.setId(1007);
		emp5.setName("amraram");
		
		//Comparator c=Comparator.comparing(Employees::getId);
		Comparator c=Comparator.comparing(Employees::getName);
		TreeSet tree=new TreeSet(c);
		tree.add(emp1);
		tree.add(emp2);
		tree.add(emp3);
		tree.add(emp4);
		tree.add(emp5);
        
		System.out.println(tree);
	}

}
