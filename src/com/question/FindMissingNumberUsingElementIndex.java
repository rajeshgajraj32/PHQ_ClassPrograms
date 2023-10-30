package com.question;
public class FindMissingNumberUsingElementIndex {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        findMissingNumber(array);
    }

    public static void findMissingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println("Missing number is: " + (i + 1));
            } else {
                nums[i] = -nums[i]; // Revert back to the original array
            }
        }
    }
}
