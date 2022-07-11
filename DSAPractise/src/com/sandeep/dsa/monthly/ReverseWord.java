package com.sandeep.dsa.monthly;

import java.util.Collections;

public class ReverseWord {
	
	public static StringBuilder getDecryptedString(String input) {

		StringBuilder builder = new StringBuilder();
		char previousChar = ' ';
		StringBuilder number = new StringBuilder();
		for (char c : input.toCharArray()) {
		    if (Character.isDigit(c)) {
		        number.append(c);
		        continue;
		    }

		    if (number.length() > 0 && !Character.isDigit(c) ) {
		        int count = Integer.parseInt(number.toString());
		        count = count > 1 ? count - 1 : 0;
		        builder.append(String.join("", Collections.nCopies(count, String.valueOf(previousChar))));
		    }

		    builder.append(c);
		    previousChar = c;
		    number.setLength(0);
		}
		return builder;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd2";

		System.out.println(getDecryptedString(str));
	}

}
