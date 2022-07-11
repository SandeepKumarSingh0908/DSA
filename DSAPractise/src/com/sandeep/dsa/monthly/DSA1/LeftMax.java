package com.sandeep.dsa.monthly.DSA1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftMax {
	public static int[] buildLeftMax(int[] arr) {
		int[] leftMax = new int[arr.length];
		leftMax[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}
		return leftMax;
	}
	public static int[] buildRightMax(int[] arr) {
		int length = arr.length;
		int[] rightMax = new int[length];
		rightMax[length-1] = arr[length-1];
		for(int i=length-2; i>=0; i--) {
			rightMax[i] = Math.max(rightMax[i+1],arr[i]);
		}
		return rightMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
	//	Arrays.stream(buildLeftMax(arr)).forEach(item -> System.out.println(item));
		Arrays.stream(buildRightMax(arr)).forEach(item -> System.out.println(item));
	}

}
