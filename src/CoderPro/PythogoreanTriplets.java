package CoderPro;

import java.util.HashSet;

public class PythogoreanTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,2,7,3,4,5};
		System.out.println("Answer: "+checkTriplet(nums));
	}

	
	/*
	 * question is to find if there exists any Pythagorean  triplets(a*a+b*b=c*c) in the given array of numbers.
	 */
	/*
	 * This is brute force approach, where iterating through the array in 3 nested loops.
	 * Time Complexity: n*(n-1)*(n-2) O(n3).
	 * Space Complexity: O(1).
	 */
	public static boolean checkTriplet1(int[] nums) {
		boolean ans=false;
		int len=nums.length;
		for(int i=0;i<len;i++)
			for(int j=i+1;j<len;j++)
				for(int k=j+1;k<len;k++)
					if(nums[i]*nums[i]+nums[j]*nums[j]==nums[k]*nums[k])
						 return true;
		
		return ans;
	}
	
	/**
	 * This Approach is based on set data structure 
	 * Time complexity: O(N^2)
	 * Space complexity: O(N)
	 */
	public static boolean checkTriplet(int[] nums) {
		boolean ans=false;
		HashSet<Integer> numbers=new HashSet<Integer>();
		int i=0,j=0;
		for(int num:nums)
			numbers.add(num*num);
		for(Integer num1:numbers) {
			for(Integer num2:numbers) {
				if(numbers.contains(num1+num2))
					return true;
			}
		}
		return ans;
	}
	
}
