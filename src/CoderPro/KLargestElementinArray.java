package CoderPro;

import java.util.Arrays;

public class KLargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums= new int[] {1,3};
	      System.out.println("Answer: "+subsetXORSum(nums));
      
	}

	
	
	/*
	 * Given an array and an element k, Write an algorithm to find the kth largest element in the array.
	 * Array may have duplicates
	 * Approach: Sort the given array in ascending order and traverse the array from back.
	 * Time Complexity: O(NlogN)+O(K).
	 * Space Complexity: O(1)
	 */
	public static int klargest(int[] nums,int k) {
		int ans=0;
		Arrays.parallelSort(nums);
		ans=nums[nums.length-k];
		return ans;
	}
	
	
	 public static  int subsetXORSum(int[] nums) {
	        int ans=0,n=nums.length;
	        
	        for(int i=1;i<=n;i++)
	        	for(int j=0;j<n;)
	        	{
	        		int s=0;
	        		for(int k=i;k==0;k--)
	        		{
	        			if(j<n)
	        			s^=nums[j++];
	        		}
	        		ans+=s;
	        	}
	        
	        return ans;
	    }
	
}
