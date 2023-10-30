package com.question;
public class FindMissingNumberUsingCycleShort {
    public static int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
