package Leet30DayChallange;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //MaxSubArray
		//given an array of integers give the maximum sum of all the subarray of the array.
		int[] nums=new int[]{1,2,-1,-2,2,1,-2,1};
	    System.out.println("Maximum Sum Of the given arays: "+MaxSubArrayfun(nums)); 
	}

	//using two pointers
	public static int MaxSubArrayfun(int[] nums) {
		int i,j,start,end;
		int sum=0;
		//finding the starting index
		sum=nums[0];
		for( i=0,j=1;j<nums.length;j++) {
			
			if(sum<0)
			{
			   i=j;
			   sum=nums[i];  
			}
			else
				sum=sum+nums[j];
		}
		start=i;
		
		//finding the ending index
		sum=nums[nums.length-1];
		for( i=nums.length-1,j=nums.length-2;j>=0;j--) {		
		if(sum<0)
		{
		i=j;
		sum=nums[i];  
		}
		else
		sum=sum+nums[j];
		}
		end=i;
		
	    if(start>end) {
	         sum=nums[0];
	    	for(i=0;i<=nums.length-1;i++)
	    	{
	    		if(nums[i]>sum)
	    			sum=nums[i];
	    	}
	    	return sum;
	    }
	   if(start==end)
		   return nums[start];
	   
	    if(start<end) {
	    sum=0;	
		for(i=start;i<=end;i++)
			sum=sum+nums[i];
	    }
		return sum;
	}
	
}
