package com.Java.Basic;

class Solution {
	
	static int[] nums = {3,2,2,3};
	
    public static int removeElement(int[] nums, int val) {
    	int j=0;
    	int cnt=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]==val)
    		{
    			nums[i]=0;
    		}
    	}
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]!=0 && nums[j]==0)
    		{
    			int temp = nums[i];
    			nums[i] = nums[j];
    			nums[j]=temp;
    		}
    		else
    			cnt++;
    		if(nums[j]!=0)
    		{
    			j++;
    		}
    	}
    	
    	for(int a: nums)
    	{
    		System.out.println("--"+a);
    	}
        
        return cnt;
    }
    
    public static void main(String[] args)
    {
    	int cnt = removeElement(nums, 3);
    	System.out.println(cnt);
    }
}
