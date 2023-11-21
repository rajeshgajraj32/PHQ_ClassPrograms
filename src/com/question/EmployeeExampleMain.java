package com.question;
import java.util.ArrayList;
class EmployeeExampleMain {
	private int empId;
	private String empName;
	
	public EmployeeExampleMain(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	void get(EmployeeExampleMain emp) {
		System.out.println("ID: "+emp.empId);
		System.out.println("Name: "+emp.empName);
	}
}
class EmployeeExample{
	public static void main(String[] args) {
		ArrayList<EmployeeExampleMain> emplist= new ArrayList<EmployeeExampleMain>();
		EmployeeExampleMain emp1=new EmployeeExampleMain(12,"rajesh");
		EmployeeExampleMain emp2=new EmployeeExampleMain(12,"rajesh");
		EmployeeExampleMain emp3=new EmployeeExampleMain(12,"rajesh");
		
	}

}
