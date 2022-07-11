package com.sandeep.dsa.practise;

public class FindSubArray {
	
	public static boolean isPresent(int[] arr, int[] sub ) {
		int i=0,j=0;
		while(i<arr.length) {
			if(arr[i] == sub[j]) {
				j++;
				if(j==sub.length) break;
			}
			i++;
		}
		if(j<sub.length) return false;
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] sub = {4,1};
		
		System.out.println(isPresent(arr,sub));
		
		
	}
	
	
}
