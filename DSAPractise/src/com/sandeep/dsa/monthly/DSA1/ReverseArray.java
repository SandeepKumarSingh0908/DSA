package com.sandeep.dsa.monthly.DSA1;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		
		int start=0, end=arr.length-1;
		Arrays.stream(arr).forEach(num -> System.out.println(num));
		System.out.println("After Reversing");
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		
		Arrays.stream(arr).forEach(num -> System.out.println(num));
	}

}
