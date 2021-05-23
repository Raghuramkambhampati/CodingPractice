package LeetCode209;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0};
		System.out.println("Answer: "+specialArray(nums));
	}

	
	
	 public  static  int specialArray(int[] nums) {
	        int len=nums.length;
	        int j=0;
	        Arrays.parallelSort(nums);
	        for(int i=0;i<=nums[len-1];i++) {
	        	if(i==len-j)
	        		return i;
	        	while(j<len && i==nums[j])
	        		j++;
	        }
	        return -1;
	    }
}
