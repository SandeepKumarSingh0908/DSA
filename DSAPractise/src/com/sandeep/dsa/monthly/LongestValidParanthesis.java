package com.sandeep.dsa.monthly;

import java.util.Stack;

public class LongestValidParanthesis {
	
	public static boolean isValidParanthesis(String str) {
		Stack<Character> stack = new Stack<Character>();
		int count=0;
		for(char c: str.toCharArray()) {
			if(c == ')' && !stack.isEmpty()) {
				if(stack.peek() == '('){
					count++;
				}
				stack.pop();
			}else {
				stack.push(c);
				count++;
			}
		}
		
		if(stack.size()%2 != 0) {
			return false;
		}
		
		
		
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidParanthesis("(()"));
	}

}
