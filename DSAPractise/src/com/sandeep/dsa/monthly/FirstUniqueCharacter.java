package com.sandeep.dsa.monthly;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
	        String s = "leeltcode";
			for(char c: s .toCharArray()){
	            if(hash.containsKey(c)){
	                hash.remove(c);
	            }else {
	            	hash.put(c, s.indexOf(c));
	            }
	        }
			int min = 100000000;
			for(Entry<Character, Integer> item: hash.entrySet()) {
				int temp = item.getValue();
				 min = temp<min? temp : min;
			}
			System.out.println(min);
			System.out.println(hash);
			
			
	}

}
