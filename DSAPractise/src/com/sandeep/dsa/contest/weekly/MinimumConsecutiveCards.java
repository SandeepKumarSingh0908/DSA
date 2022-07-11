package com.sandeep.dsa.contest.weekly;

import java.util.HashMap;

public class MinimumConsecutiveCards {
	
	public static int minimumCardPickup(int[] cards) {
		HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<cards.length; i++){
            if(map.containsKey(cards[i])){
               min = Math.min(min, i-map.get(cards[i])+1);
                map.put(cards[i],i);
            }else{
                map.put(cards[i],i);
            }
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
	public static void main(String[] args) {
		int[] cards = {3,4,2,3,4,7};
		System.out.println(minimumCardPickup(cards));
	}

}
