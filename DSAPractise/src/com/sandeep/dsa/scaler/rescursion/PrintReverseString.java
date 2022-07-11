package com.sandeep.dsa.scaler.rescursion;

public class PrintReverseString {
	public static void printReverseString(String str,int pointer) {
		
		if(pointer < 0) return;
		
		System.out.println(str.charAt(pointer));
		printReverseString(str,--pointer);
	}
	public static void printInOriginalOrder(String str,int pointer) {
		
		if(pointer >= str.length()) return;
		
		System.out.println(str.charAt(pointer));
		printInOriginalOrder(str,++pointer);
	}
	
	public static void reverseString(char[] s, int start, int end) {
		if(start>=end) return;
		
		char temp = s[start];
		s[start] = s[end];
		s[end] = temp;
		
		reverseString(s,start+1,end-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'a','b','c'};
		reverseString(s,0,s.length-1);
		System.out.println(s);
	}

}
