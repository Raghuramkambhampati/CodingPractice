package CoderPro;

public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,2,3,4};
		
		
		for(int n:product(nums))
		 System.out.print("->"+n);
	}

	
	
	
	/*
	 * Approach: brute force 
	 * Time Complexity: O(N2) 
	 * Space Complexity: O(N)
	 */
	public static int[] product1(int[] nums){
		int len=nums.length,product=1;
		int[] ans=new int[len];
		for(int i=0;i<len;i++) {
			product=1;
			for(int j=0;j<len;j++)
			{
				if(i!=j)
					product*=nums[j];	
			}
			ans[i]=product;
		}
		
		return ans;
	}
	
	
	/*
	 * Approach:using divide operator
	 * Time complexity: O(2N)
	 * SPace Complexity: O(N)
	 */
	public static int[] product2(int[] nums){
		int len=nums.length;
		int[] ans=new int[len];
		long product=1;
		for(int n:nums) 
			product*=n;
		
		for(int i=0;i<len;i++)
			ans[i]=(int)product/nums[i];
		return ans;
	}
	
	/*
	 * Approach: DP, storing repeated subproblems
	 * Time Complexity: O(2N)
	 * Space Complexity: O(2N)
	 */
	public static int[] product(int[] nums){
		int len=nums.length;
		int[] ans=new int[len];
		int[] right=new int[len];
		int[] left=new int[len];
		 //int product=1;
		left[0]=1;
		left[1]=nums[0];
		for(int i=2;i<len;i++) 
			left[i]=nums[i-1]*left[i-1];
		
			
		right[len-1]=1;
		right[len-2]=nums[len-1];
		for(int i=len-3;i>=0;i--)
			right[i]=nums[i+1]*right[i+1];
		
		for(int i=0;i<len;i++)
			ans[i]=right[i]*left[i];
		
		return ans;
	}
	
}
