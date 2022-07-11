package com.sandeep.dsa.scaler.bitManipulation;

public class ReverseBits {
	public static long reverse(long a) {
        long result = 0;
        int power = 31;
        while(a != 0){
            
                result += Math.pow(2,power); 
                System.out.println(result + "Power: " + power);
            System.out.println(a);
            a = a & (a-1);
           
            power--;
        }

        return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(2));
		System.out.println(Math.pow(2,30));
	}

}
