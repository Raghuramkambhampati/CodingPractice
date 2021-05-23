package CoderPro;

public class Sort3unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums=new int[] {2,2,3,3,1,1,2};
      for(int n:nums)
          System.out.println(n);
      nums=sort3Ele(nums);
      System.out.println("after Sorting:");
      for(int n:nums)
      System.out.println(n);
	}

	
	public static int[] sort3Ele(int[] nums) {
		int firstPointer=0;
		int secondpointer=0;
		int thirdpointer=nums.length-1;
		int tmp;
		
		  while(nums[firstPointer]==1) firstPointer++; 
		  while(nums[thirdpointer]==3)
		  thirdpointer--; 
		  secondpointer=firstPointer;
		 
		while(secondpointer<=thirdpointer) {
			if(nums[secondpointer]==1)
			{
				tmp=nums[secondpointer];
				nums[secondpointer]=nums[firstPointer];
				nums[firstPointer]=tmp;
				firstPointer++;
				secondpointer++;
			}
			else if(nums[secondpointer]==2)
			{
				secondpointer++;
			}
			else if(nums[secondpointer]==3)
			{
				tmp=nums[secondpointer];
				nums[secondpointer]=nums[thirdpointer];
				nums[thirdpointer]=tmp;
				thirdpointer--;
			}
				
		}
		
		return nums;
	}
}
