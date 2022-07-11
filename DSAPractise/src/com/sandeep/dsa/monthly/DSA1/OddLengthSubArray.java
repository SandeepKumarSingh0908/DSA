package com.sandeep.dsa.monthly.DSA1;

public class OddLengthSubArray {
	
	public static int oddLengthSubArray(int[] arr) {
		int totalSum=0,length=arr.length;
		
		for(int i=0; i<length; i++) {
			for(int j=i; j<length; j++) {
				if((j-i+1) % 2 != 0) {
					System.out.println(j-i+1);
					for(int k=i; k<=j; k++) {
						totalSum += arr[k];
					}
				}
			}
		}
		
		return totalSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,5,3};
		System.out.println(oddLengthSubArray(arr));

	}

}
