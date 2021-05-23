package CoderPro;

import java.util.HashSet;
import java.util.Iterator;

public class SingleDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {2,4,5,6,2,4,5};
		System.out.println("Answer: "+ singleNum(nums));
	}

	
	
	/**
	 * Find the unique  number in the given array.
	 * array has duplicates for each element in it except for a single number. Need to return the single number
	 */
	
	/*
	 * This approach stores the count in a countMap and gets the unique element.
	 * Time complexity: O(N)
	 * Space Complexity: O(N/2) to O(1)
	 */
	public static int singleNum1(int[] nums) {
		HashSet<Integer> numbers=new HashSet<>();
		int ans=0;
		for(int num:nums) {
			if(!numbers.contains(num)) 
				numbers.add(num);
			else
				numbers.remove(num);
		}
		Iterator<Integer> itr=numbers.iterator();
		return itr.next().intValue();
	}
	
	
	
	/*
	 * This approach is of using the XOR operator.
	 * Time Complexity: O(N)
	 * Space complexity: O(1)
	 */
	
	public static int singleNum(int[] nums) {
		int ans=0;
		for(int num:nums)
			ans^=num;
		return ans;
	}
}
