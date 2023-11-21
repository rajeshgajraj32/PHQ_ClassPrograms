package com.question;

import java.util.Arrays;

public class ElectionRelatedProgram {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,1,2,3,1,1,2,4,5,4,5,45,4,5,8,7,9,10,0};
		int count=0,legalVote=0,maxvote=0,party=0;
		for(int i=1;i<=5;i++) {
			for(int a:arr) {
				if(i==a) {
					count++;
				legalVote++;
				}
			}			
			System.out.println("Party Number "+i+" Total vote is:"+count);
			if(maxvote<count) {
				maxvote=count;
			    party=i;
			}
			count=0;
		}
		System.out.println("Total spoilt vote is :"+(arr.length-legalVote));
		System.out.println("--------------------------");
		System.out.println("Winner Party congress  with "+maxvote+" vote \n congress Zindabad thi Zindabad hai Zindabad rhegi");
	}

}
