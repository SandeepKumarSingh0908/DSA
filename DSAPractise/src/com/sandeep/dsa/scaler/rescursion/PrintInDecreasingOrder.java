package com.sandeep.dsa.scaler.rescursion;

public class PrintInDecreasingOrder {
	
	public static void printInDecreasingOrder(int n) {
		if(n==0) return;
		
		//assumption and main logic
		System.out.println(n);
		printInDecreasingOrder(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInDecreasingOrder(5);
	}

}
