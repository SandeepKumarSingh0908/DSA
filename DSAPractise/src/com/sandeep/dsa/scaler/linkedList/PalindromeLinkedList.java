package com.sandeep.dsa.scaler.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {
	public static boolean isPalindrome(int[] arr) {
        if(arr.length == 1) return true;
        Stack<Integer> s = new Stack<>();
        for(int num: arr) {
        	if(!s.isEmpty()) {
        		if(s.peek() == num) {
        			s.pop();
        		}
        	}
        	s.push(num);
        	System.out.println(s.toString());
        }
       
        return s.size()==0?true:false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,1};
		
		System.out.println(isPalindrome(arr));
		
		try {
			System.out.println(1/0);
		}finally {
			System.out.println("this gonna run");
		}
		System.out.println("This too");
			
	}

}
