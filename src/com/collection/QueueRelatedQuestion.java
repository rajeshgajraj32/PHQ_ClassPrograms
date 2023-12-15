package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueRelatedQuestion {
    int priority;
    String name;
    QueueRelatedQuestion(int priority,String name){
    	this.priority=priority;
    	this.name=name;
    }
    public static void printer() {
    	Scanner sc=new Scanner(System.in);
		Comparator c= new Comparator<QueueRelatedQuestion>() {
			@Override
			public int compare(QueueRelatedQuestion o1, QueueRelatedQuestion o2) {
				return o1.priority<o2.priority?o1.priority==o2.priority?0:1:-1;
			}
			
		};
		Queue<QueueRelatedQuestion> store=new PriorityQueue<QueueRelatedQuestion>(c);
		while(true) {
			System.out.println("select Option- \n1 Insert Document\n2 Print Document\n3 show document\n4 exit");
			int select=sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1:
				System.out.println("Enter Document:");
				String document=sc.nextLine();
				System.out.println("Enter Priority:");
				int pri=sc.nextInt();
				store.add(new QueueRelatedQuestion(pri,document));
				break;
			case 2:
				System.out.println("Document: "+store.peek().name+" and Priority: "+store.peek().priority);
				store.poll();
				break;
			case 3:
				for(QueueRelatedQuestion q:store) {
					System.out.println("Document: "+q.name+" and Priority: "+q.priority);
				}
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}
    }
	public static void main(String[] args) {
		printer();
	}

}
