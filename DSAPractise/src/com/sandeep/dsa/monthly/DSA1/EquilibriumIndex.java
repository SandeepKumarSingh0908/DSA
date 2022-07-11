package com.sandeep.dsa.monthly.DSA1;

import java.util.Arrays;


class Pair {
	private boolean isEquilibrium;
	private int index;
	
	public boolean isEquilibrium() {
		return isEquilibrium;
	}
	public void setEquilibrium(boolean isEquilibrium) {
		this.isEquilibrium = isEquilibrium;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Pair [isEquilibrium=" + isEquilibrium + ", index=" + index + "]";
	}
	
	
}
public class EquilibriumIndex {
	
	//TC(O(n) SC(O(n))
	public static Pair isEquilibriumIndex(int[] arr) {
		
		//Building the prefix sum
		Pair result = new Pair();
		int[] ps = new int[arr.length];
		ps[0] = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			ps[i] = ps[i-1] + arr[i];
		}
		
		//Checking for Equilibrium Index
//		for(int i=0; i<arr.length; i++) {
//			if(ps[i-1] == ps[arr.length-1]-ps[i]) {
//				result.setEquilibrium(true);
//				result.setIndex(i);
//			}
//		}
		
		
		for(int i=0; i<arr.length; i++) {
			int sl=0,sr=0;
			if(i!=0) {
				sl = ps[i-1];
			}
			if(sr!=arr.length-1) {
				sr=ps[arr.length-1]-ps[i];
			}
			
			if(sl == sr) {
				result.setEquilibrium(true);
				result.setIndex(i);
				break;
			}
		}
		return result;
	}
	
	public static Pair isEquilibriumIndexOptimized(int[] arr) {
		Pair result  = new Pair();
		
		int totalSum=0;
		int length = arr.length;
		for(int i=0; i<length;i++) {
			totalSum += arr[i];
		}
		int currentSum=0;
		for(int i=0; i<length; i++) {
			int sl=0,sr=0;
			if(i!=0) {
				sl = currentSum;
			}
			if(i!=length-1) {
				sr = totalSum-currentSum-arr[i];
			}
			System.out.println(i+":"+sl+":"+sr+":"+currentSum);
			if(sr == sl) {
				result.setEquilibrium(true);
				result.setIndex(i);
				break;
			}
			currentSum += arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,-4,10};
		
		System.out.println(isEquilibriumIndexOptimized(arr));
		
	}

}
