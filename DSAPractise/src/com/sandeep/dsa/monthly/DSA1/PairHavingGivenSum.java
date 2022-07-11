package com.sandeep.dsa.monthly.DSA1;

public class PairHavingGivenSum {
	
	public static boolean isPairHavingGivenSum(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == sum) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,7,6};
		System.out.println(isPairHavingGivenSum(arr, 20));
	}

}
