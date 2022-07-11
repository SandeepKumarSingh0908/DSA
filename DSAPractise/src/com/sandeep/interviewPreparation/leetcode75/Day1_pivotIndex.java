package com.sandeep.interviewPreparation.leetcode75;

public class Day1_pivotIndex {
	
	public static int pivotIndex(int[] nums) {
        int pivotIndex = -1,length=nums.length;
        int[] ps = new int[length];
        ps[0] = nums[0];
        for(int i=1; i<length; i++) {
        	ps[i] = ps[i-1]+nums[i];
        }
        
        //finding pivot index
        for(int i=0; i<length; i++) {
        	int leftSum=0,rightSum=0;
        	if(i!=0) {
        		leftSum = ps[i-1];
        		
        	}
        	if(i<length-1) {
        		rightSum = ps[length-1]-ps[i];
        	}
        	
        	if(leftSum == rightSum) {
        		pivotIndex = i;
        		break;
        	}
        	
        }
        return pivotIndex;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,-1};
		System.out.println(pivotIndex(arr));
	}

}
