package com.collection.comparator;
public class Patient implements Comparable<Patient> {
	// comparable example 
	private int pId;
	private String pName;
	private int priority;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Patient(int pId, String pName, int priority) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", priority=" + priority + "]";
	}

	public int compareTo(Patient o) {
		
		return Integer.compare(this.getPriority(), o.getPriority());
	}
	


}
