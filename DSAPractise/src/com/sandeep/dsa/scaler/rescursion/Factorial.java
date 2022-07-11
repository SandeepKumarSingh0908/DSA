package com.sandeep.dsa.scaler.rescursion;

public class Factorial {
	
	public static int fact(int n) {
		if(n==1) return 1;
		//assumption and mainlogic
		return fact(n-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
