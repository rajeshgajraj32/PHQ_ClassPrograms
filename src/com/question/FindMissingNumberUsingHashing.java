package com.question;

import java.util.Scanner;
import java.util.HashSet;

public class FindMissingNumberUsingHashing {

    public static int findMissingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length + 1; // total number of elements including the missing one
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // if no missing number found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8,10,15};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
