package com.sandeep.dsa.monthly.DSA1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static boolean containsDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int num: nums) {
			if(set.contains(num)) {
				return false;
			}else {
				set.add(num);
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		if(containsDuplicates(nums)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
