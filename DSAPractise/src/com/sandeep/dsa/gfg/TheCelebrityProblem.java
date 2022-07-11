package com.sandeep.dsa.gfg;

import java.util.ArrayList;

public class TheCelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1}, 
		         {1,0}};
		ArrayList<Integer> Arr = new ArrayList<>();
		Arr.
		System.out.println(findCelebrity(arr));
	}

	private static int findCelebrity(int[][] arr) {
		// TODO Auto-generated method stub
		int found = -1;
		boolean first = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == 1) {
					if(found == -1) {						
						found = j;
					}else {
						if(found != j) return -1;
					}
				}
			}
		}
		return found;
		
		
	}

}
