package com.sandeep.dsa.scaler.rescursion;

public class IsPalindrome {
	public static boolean isPalindrome(String str,int start, int end) {
		if(start>end) {
			return true;
		}
		
		//assumption and logic
		 if(str.charAt(start) == str.charAt(end)) {
			 return isPalindrome(str, start+1, end-1);
		 }else {
			 return false;
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("LOLE", 0, 3));
	}

}
