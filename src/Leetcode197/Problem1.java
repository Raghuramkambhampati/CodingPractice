package Leetcode197;

import java.util.HashMap;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2};
		System.out.println("Answer: "+numIdenticalPairs(nums));
	}

	
	
public static int numIdenticalPairs(int[] nums) {
    int ans=0;
    HashMap<Integer,Integer> numCount=new HashMap<Integer,Integer>();    
        for(int num:nums) 
    	numCount.put(num, numCount.getOrDefault(num, 0)+1);
    
	    for(Integer n:numCount.values())
	    	ans+=(n*(n-1))/2;
	
	return ans;
    }
}
