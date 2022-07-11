package com.sandeep.dsa.gfg;

public class FindNumbersWithEvenNumberofDigits {
	public static int findDigit(int num){
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int count=0;
        for(int num: nums){
            if(findDigit(num) % 2 == 0){
                count++;
            }
        }
       System.out.println(count);

	}

}
