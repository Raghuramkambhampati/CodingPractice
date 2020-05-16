package LeetCode;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums=new int[] {0,0,1,1,2,2,3,5,5,6,6,10,10};
       System.out.println("Answer: "+removeDuplicate(nums));
	}

	
	public static int  removeDuplicate(int[] nums) {
		int i=0,j=0,tmp=0;
	    while(j<nums.length) {
	    	
	    	while(j<nums.length && nums[j]<=nums[i])
	    		j++;
	    	
	    	if(j<nums.length && nums[j]>nums[i]) 
	    	{
	    		i++;
	    		if(j!=i) {
	    			tmp=nums[i];
	    			nums[i]=nums[j];
	    			nums[j]=tmp;
	    		}
	    		j++;
	    	}
	    	
	    }
		
		
		return i+1;
	}
}
