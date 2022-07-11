package com.sandeep.dsa.gfg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Finding3DigitEvenNumbers {
	
	public static ArrayList<Integer> findEvenNumbers(int[] arr) {
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> res = new ArrayList<>();
		for(int num: arr) {
			set.add(num);
		}
		
		for(int i=100; i<=999; i++) {
			if(set.contains(i/100) && i%2==0) {
				res.add(i);
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {2,1,3,0};
		ArrayList<Integer> result = findEvenNumbers(arr);
		for(int num: result) {
			System.out.println(num);
		}
	}

}
