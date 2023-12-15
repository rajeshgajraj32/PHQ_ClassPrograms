package com.collection.comparator;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyRoom {

	public static void main(String[] args) {
		// comparator example 
		Comparator comparator = new Comparator<Patient>() {

			@Override
			public int compare(Patient o1, Patient o2) {
			
				return Integer.compare(o1.getPriority(), o2.getPriority());
			}
		};
	
		PriorityQueue<Patient> queue = new PriorityQueue<Patient>(comparator);
		queue.add(new Patient(101, "gopal", 6));
		queue.add(new Patient(102, "dheeraj", 13));
		queue.add(new Patient(103, "rajesh", 4));
		queue.add(new Patient(104, "choudhary", 1));
		queue.add(new Patient(105, "anand", 9));
		queue.add(new Patient(106, "phrlad", 20));
		
		
//		Collections.sort(queue, comparator);
		
		System.out.println(queue);
		while(!queue.isEmpty()) {
			Patient patient = queue.poll();
			System.err.println(patient.getpName() + patient.getPriority());
		}
		
	}

}
