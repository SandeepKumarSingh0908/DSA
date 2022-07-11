package com.sandeep.dsa.monthly.DSA1;


//Count the elements having atleast one greater element in the array
public class CountElement {
	
	public static int approachOne(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			
			for(int j=0;j<arr.length; j++) {
				if(arr[j]>temp) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public static int approachSecond(int[] arr) {
		//optimized one T(O(n)) S(O(1))
		
		//Finding the greatest element in array
		int max = arr[0],countMax=0;
		for(int num : arr) {
			if(num>max) {
				max = num;
			}
		}
		
		//Finding the occurence of the max element 
		for(int num: arr) {
			if(num == max) {
				countMax++;
			}
		}
		
		//We can find the max and its count in single loop itself
//		for(int num: arr) {
//			if(num == max) count++;
//			else {
//				if(num > max) {
//					max = num;
//					count = 1;
//				}
//			}
//			
//		}
		//Now calculating the result as -------------- result = TotalElement - count of max Element
		return arr.length-countMax;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,5,1,4,8,0,8,1,3,8,8,7,5,8,8};
		
		
		
		System.out.println(approachSecond(arr));
		
		
	}

}
