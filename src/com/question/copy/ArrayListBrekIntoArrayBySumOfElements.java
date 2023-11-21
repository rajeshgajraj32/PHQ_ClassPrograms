package com.question.copy;

import java.util.ArrayList;

public class ArrayListBrekIntoArrayBySumOfElements {
	// input an ArrayList [-1,0,1,2,-1,-1]
    // output array [-1,0,1] [-1,-1,2]
	static void secondResult() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-2);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(-1);
		list.add(-1);

		for (int i = 0; i < list.size() - 2; i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {
				for (int k = j + 1; k < list.size(); k++) {
					int result = list.get(i) + list.get(j) + list.get(k);
					if (result == 0) {
						int[] arr = { list.get(i), list.get(j), list.get(k) };
						for (int nums : arr)
							System.out.print(nums + " ");
						System.out.println();
						list.remove(i);
						list.remove(j - 1);
						list.remove(k - 2);
						i = -1;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		secondResult();

	}

}
