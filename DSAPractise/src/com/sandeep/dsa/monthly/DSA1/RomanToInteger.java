package com.sandeep.dsa.monthly.DSA1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
         map.put('V',5);
         map.put('X',10);
        map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
         
        int sum=map.get(s.charAt(0));
        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)) ){
                sum -= map.get(s.charAt(i));
            }else{
                sum += map.get(s.charAt(i));
            }
        }
        
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("III"));
	}

}
