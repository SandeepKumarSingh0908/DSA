package com.sandeep.dsa.scaler.rescursion;

public class SumOfDigits {
	
	public static int sumOfDigits(int number) {
		if(number==0) return 0;
		return sumOfDigits(number/10) + number%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(123));
	}

}
