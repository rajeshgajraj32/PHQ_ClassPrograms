package com.question;

public class FindGreaterNumber {
    public void greaterNumber() {
    	int arr[]= {5,13,12,15,22,52,6,70};
    	for(int i=0;i<arr.length;i++) {
    		if(i>0&&i<arr.length-1) {
    			if(arr[i-1]<arr[i]&&arr[i+1]<arr[i])
    				System.out.println(arr[i]);
    		}else if(i==0) {
    			if(arr[i+1]<arr[i])
    				System.out.println(arr[i]);
    		}else {
    			if(arr[i-1]<arr[i])
    				System.out.println(arr[i]);
    		}
    	}
    }
	public static void main(String[] args) {
		FindGreaterNumber object=new FindGreaterNumber();
		object.greaterNumber();

	}

}
