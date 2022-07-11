package com.sandeep.dsa.scaler.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList();
		int[] arr = {1,0,1,1,1};
		for(int num:  arr) {
			list.add(num);
		}
		String str="";
		for(int val: list) {
			str+=val;
		}
		int number = 0,power=0;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == '1') {
				number += Math.pow(2,power);
			}
			power++;
		}
		System.out.println(number);
	}

}
