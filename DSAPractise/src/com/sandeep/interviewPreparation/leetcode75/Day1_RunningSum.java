package com.sandeep.interviewPreparation.leetcode75;

import java.util.Arrays;

public class Day1_RunningSum {
	 public static int[] runningSum(int[] nums) {
	        int[] runningSum = new int[nums.length];
	        runningSum[0] = nums[0];
	        for(int i=1; i<nums.length; i++) {
	        	runningSum[i] = runningSum[i-1]+nums[i];
	        }
	        
	        return runningSum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] ans = runningSum(nums);
		for(int num: ans) {
			System.out.println(num);
		}
	}

}
