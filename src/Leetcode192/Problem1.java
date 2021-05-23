package Leetcode192;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums=new int[]{2,5,1,3,4,7};
        System.out.println(" ");
        shuffle(nums,3);
	}

	
	 public static  int[] shuffle(int[] nums, int n) {
	        int[] ans=new int[2*n];
	        
	        for(int i=0,j=0;i<n;i++,j=j+2) {
	        	ans[j]=nums[i];
	        	ans[j+1]=nums[i+n];
	        }
	        return ans;
	    }
}
