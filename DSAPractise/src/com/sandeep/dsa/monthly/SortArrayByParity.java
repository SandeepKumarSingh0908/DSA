package com.sandeep.dsa.monthly;

import java.util.Collection;

public class SortArrayByParity {
	
	 public static int[] sortArrayByParity(int[] nums) {
	        int evenPointer = 0;
	        
	        for(int i=0; i<nums.length; i++) {
	        	if(nums[i]%2 == 0 ) {
	        		int temp = nums[evenPointer];
	        		nums[evenPointer] = nums[i];
	        		nums[i] = temp;
	        		
	        		evenPointer++;
	        	}
	 
	        }
	        return nums;
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {0};
		 int[] ans = sortArrayByParity(nums);
		 for(int num: ans) {
			 System.out.println(num);
		 }
		 
	 }

}
