package com.sandeep.dsa.monthly.DSA1;

class NumArray{
	private int[] ps;
    public NumArray(int[] nums) {
        this.ps = new int[nums.length];
        ps[0] = nums[0];
        
        for(int i=1; i<nums.length; i++){
            ps[i] = ps[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        if(left == 0){
            sum = this.ps[right];
        }
        else{
            sum = this.ps[right]-ps[left-1];
        }
        return sum;
    }
}
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		NumArray obj = new NumArray(nums);
		System.out.println(obj.sumRange(0, 4));
	}

}
