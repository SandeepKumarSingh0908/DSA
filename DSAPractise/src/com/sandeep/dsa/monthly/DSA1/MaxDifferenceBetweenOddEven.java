package com.sandeep.dsa.monthly.DSA1;

public class MaxDifferenceBetweenOddEven {
	
	public static int maxDifference(int[] arr) {
		int evenMax=Integer.MIN_VALUE,oddMax=Integer.MAX_VALUE;
		for(int num: arr) {
			 if(num%2 == 0 && num>evenMax) {
				 evenMax = num;
			 }
			 
			 if(num%2 != 0 && num<oddMax) {
				 oddMax = num;
			 }
		}
		return evenMax-oddMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 17, 100, 1};
		
		System.out.println(maxDifference(arr));
	}

}
