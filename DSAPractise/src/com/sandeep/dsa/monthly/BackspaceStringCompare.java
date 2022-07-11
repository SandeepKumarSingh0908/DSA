package com.sandeep.dsa.monthly;

import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		
		
		
		
		
		
		String strFirst = "bxj##tw",strSecond="bxj###tw";
		
		for(char c: strFirst.toCharArray()) {
			if(c!='#') {
				stack1.push(c);
			}else{
				if(!stack1.isEmpty())
					stack1.pop();
			}
		}
		for(char c: strSecond.toCharArray()) {
			if(c!='#') {
				stack2.push(c);
			}else{
				if(!stack2.isEmpty())
				stack2.pop();
			}
		}
		boolean flag = true;
		while(!stack1.isEmpty() && !stack2.isEmpty()) {
			if(stack1.peek() != stack2.peek()) {
				flag = false;
				break;
			}stack1.pop();
			stack2.pop();
		}
		
		if(flag) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		
	}

}
