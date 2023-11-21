package com.question.copy;
public class FindMissingNumberUsingBinaryOperater {
    public static int findMissingNumber(int[] nums) {
        int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            missing ^= (i + 1) ^ nums[i];
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
