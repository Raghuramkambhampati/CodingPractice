package Leetcode212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		int[] l=new int[] {0,1,6,4,8,7};
		int[] r=new int[] {4,4,9,7,9,10};
		System.out.println("Answer: "+checkArithmeticSubarrays(nums,l,r));
	}

	
	
	 public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		 int len=l.length;
		 List<Boolean> ans=new ArrayList();
		 int[] tmp;
		 int tmplen;
		 for(int i=0;i<len;i++) {
			 tmplen=r[i]-l[i]+1;
			 tmp=new int[tmplen];
			 int k=0;
			 for(int  j=l[i];j<=r[i];j++,k++)
				 tmp[k]=nums[j];
			 ans.add(i,checkArthimitic(tmp));
		 }
		 return ans;
	    }
	 
	 
	 public static boolean checkArthimitic(int[] arr) {
		 Arrays.parallelSort(arr);
		 int len=arr.length;
		 if(len==1 || len==0)
			 return true;
		 int diff=arr[1]-arr[0];
		 for(int i=2;i<len;i++) {
			 if(diff!=(arr[i]-arr[i-1]))
				 return false;
		 }
		 return true;
	 }
	 
}
