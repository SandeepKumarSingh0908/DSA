package com.sandeep.dsa.monthly.DSA1;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum=0,maximum=nums[0];
		for(int num: nums) {
			sum += num;
			if(sum>maximum) {
				maximum = sum;
			}
			if(sum < 0) {
				sum=0;
			}
		}
		
		System.out.println(maximum);
	}

}
