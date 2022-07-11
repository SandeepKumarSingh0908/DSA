package com.sandeep.dsa.monthly.DSA1;

public class SpecialSubsequences {
	
	public static int countSpecialSubSeq(String str) {
		int count=0,countA=0;
		for(char c: str.toCharArray()) {
			if(c=='a') countA++;
			if(c =='g') count += countA;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSpecialSubSeq("abgegag"));
	}

}
