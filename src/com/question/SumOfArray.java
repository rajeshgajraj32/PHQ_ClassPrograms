package com.question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfArray {
	int []array= {10,50,40,60,70};
	int result;
    public void usingForLoop() {
    	result=0;
    	for(int i=0;i<array.length;i++) {
    		result+=array[i];
    	}
    	System.out.println("result using for loop is: "+result);
    }
    public void usingForEachLoop() {
    	for(int i:array) {
    		result+=i;
    	}
    	System.out.println("result using for each loop is: "+result);
    }
    public void usingAPI()
    {
    	System.out.println("result using Java 8 Stream API: "+Arrays.stream(array).sum());
    }
    
    public int usingRecursion(int []arr,int length) {
    	if(length<=0) {
    	return 0;
    	}
    	else {
    		return usingRecursion(arr,length-1)+arr[length-1];
    	}
    }
	public static void main(String[] args) {
		SumOfArray soa = new SumOfArray();
		soa.usingForEachLoop();
		soa.usingForLoop();
		System.out.println("result using recursion is: "+soa.usingRecursion(soa.array,soa.array.length));
		soa.usingAPI();

	}

}
