package com.question.copy;
public class FindMissingNumberUsingSummation {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int arraySum = 0;
        for (int num : nums) {
            arraySum += num; // Sum of array elements
        }

        return totalSum - arraySum; // The missing number
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Example array
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
