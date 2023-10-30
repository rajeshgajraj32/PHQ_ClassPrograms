package com.question;

import java.util.Scanner;

public class MarksShowing {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer[] rollNumber = new Integer[10];
		Integer[] marks = new Integer[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter Roll Number:");
			rollNumber[i]=sc.nextInt();
			System.out.println("Enter Marks:");
			marks[i]=sc.nextInt();
		}
		int blank=0;
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(marks[i]<marks[j])
				{
					blank=marks[i];
					marks[i]=marks[j];
					marks[j]=blank;
					
					blank=rollNumber[i];
					rollNumber[i]=rollNumber[j];
					rollNumber[j]=blank;
				}
			}
		}
		for(int k=0;k<10;k++) {
			System.out.println(rollNumber[k]+"-"+marks[k]);
		}

	}

}
