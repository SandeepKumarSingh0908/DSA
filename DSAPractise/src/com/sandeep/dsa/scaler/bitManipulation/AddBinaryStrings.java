package com.sandeep.dsa.scaler.bitManipulation;

public class AddBinaryStrings {
	
	public String addBinary(String first, String second) {
		String result = null;
		int i=first.length(),j=second.length();
		
		while(i>=0 && j>=0) {
			if(first.charAt(i) != second.charAt(i)) {
				if(carry='1') {
					result
				}
				result += '0';
			}else {
				result += first.charAt(i);
			}
			i--;
			j--;
		}
		if(i!=0) {
			while(i>=0) {
				result += first.charAt(i)
			}
		}
		
		
		
		return result;
	}
	public static void main(String[] args) {
		
	}

}
