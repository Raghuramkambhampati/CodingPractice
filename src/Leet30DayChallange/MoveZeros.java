package Leet30DayChallange;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,2,3,0,4,0
		//1,2,3,4,10,100
		//0,0,n,n,0,n,0
		//n,n,n,0,0,0,n,0
       int[] nums=new int[] {0,2,3,0,4,0};
       
       
       nums=moveZeros(nums);
       for(int i=0;i<nums.length;i++)
        System.out.print(" "+nums[i]);
	}

	
	public static int[] moveZeros(int[] nums)
	{
		int tmp;
		//i: points to first zero in the array
		//j: points to first non zero after i 
		for(int i=0,j=0;j<nums.length&&i<nums.length;) {
			if(nums[i]!=0)
				i++;
			else
			{
				while( (j<nums.length)&&(j<=i || nums[j]==0))
					j++;
				 if(j>=nums.length)
					break;
				tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
				i++;
				j++;
			}
			
		}
		
		return nums;
	}
}
