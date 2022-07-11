package com.sandeep.interviewPreparation.leetcode75;

public class Day2_isSubsequence {
	public static boolean isSubsequence(String s, String t) {
        int first=0,second=0;
        while(second<t.length()) {
        	if(s.charAt(first) == t.charAt(second)) {
        		first++;
        	}
        	second++;
        }
        
        if(first<s.length()) {
        	return false;
        }else {
        	return true;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("axc","ahbgdc"));
	}

}
