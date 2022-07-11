package com.sandeep.dsa.scaler.rescursion;

public class SumOfNnumbers {
	
	public static int sum(int n) {
		//base condition
		if(n==1) return 1;
		//Assumption and main Logic
		return sum(n-1)+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
