package com.sandeep.dsa.monthly.DSA1;

import java.util.Arrays;

public class FindTheAHighestAltitude {
	
	//TimeComplexity = O(N) and SpaceComplexity = O(N)
	public static int findHighestAltitude(int[] arr) {
		int length = arr.length,maxGain=0;
		int[] altitudes = new int[length+1];
		altitudes[0] = 0;
		
		for(int i=1; i<altitudes.length; i++) {
			altitudes[i] = altitudes[i-1]+arr[i-1];
		}
		
		for(int num: altitudes) {
			System.out.println(num);
		}
		return maxGain;
		
	}
	
	
	public static int findHighestAltitudeOptimized(int[] arr) {
		int maxGain = 0;
		int currentGain=0;
		for(int num: arr) {
			currentGain += num;
			maxGain = Math.max(maxGain, currentGain);
		}
		return maxGain;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-3,-2,-1,4,3,2};
		System.out.println(findHighestAltitudeOptimized(arr));
		
		
			//	[-4,-3,-2,-1,4,3,2]
	}

}
