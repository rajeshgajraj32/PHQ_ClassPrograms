package com.question.copy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBrekIntoArrayBySumOfElements {
	// Que: input an ArrayList [-1,0,1,2,-1,-1]
	// output array [-1,0,1] [-1,-1,2] with  Ascending order
	static void breakArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-2);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(-1);
		list.add(-1);
		list.add(-1);
		list.add(0);
		list.add(1);
		list.add(1);
        
		Collections.sort(list);
		for (int i = 0; i < list.size() - 2 && list.size() > 2; i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {
				for (int k = j + 1; k < list.size(); k++) {
					int result = list.get(i) + list.get(j) + list.get(k);
					if (result == 0) {
						System.out.println("{" + list.get(i) + "," + list.get(j) + "," + list.get(k) + "}");
						list.remove(i);
						list.remove(j - 1);
						list.remove(k - 2);
						i = -1;
						j = list.size();
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		breakArrayList();
	}
}
