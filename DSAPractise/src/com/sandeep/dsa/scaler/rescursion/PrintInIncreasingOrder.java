package com.sandeep.dsa.scaler.rescursion;

public class PrintInIncreasingOrder {
	public static void printInIncreasingOrder(int n) {
		if(n==0) {
			return;
		}
		//assumption and logic
		printInIncreasingOrder(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInIncreasingOrder(5);
	}

}
