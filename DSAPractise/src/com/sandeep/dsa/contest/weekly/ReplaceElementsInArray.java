package com.sandeep.dsa.contest.weekly;

import java.util.HashMap;

public class ReplaceElementsInArray {
	
	public static void replaceElements(int[] nums, int[][] operations) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i],i);
		}
		
		for(int[] op: operations) {
			nums[map.get(op[0])] = op[1];
			map.remove(op[0]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
