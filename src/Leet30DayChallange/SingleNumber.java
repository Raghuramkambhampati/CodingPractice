package Leet30DayChallange;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Given a non-empty array of integers, every element appears twice except for one. Find that single one.
		//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
		int[] nums=new int[] {10,10,40,20,40};
		System.out.println("Answer: "+singleNumber(nums));
		
	}

	
	 public static int singleNumber(int[] nums) {
	        
		/*
		 * HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>(); int count;
		 * for(int n:nums) { count=countMap.containsKey(n)==false? 0 : countMap.get(n);
		 * if(count==1) countMap.remove(n); else countMap.put(n, ++count); }
		 * 
		 * return countMap.keySet().iterator().next();
		 */
		 HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>(); int count;
		 for(int n:nums) {
	        	if(countMap.containsValue(n))
	        		countMap.remove(n,1);
	        	else
	        	countMap.put(n,1);
	        }
	        	
	        return countMap.keySet().iterator().next();
     
	    }
}
