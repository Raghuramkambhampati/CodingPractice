package LeetCode196;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] left= {};
		int[] right= {0,1,2,3,4,5,6,7};
		int n=7;
		System.out.println("Anser: "+getLastMoment(n,left,right) );
	}

	
	
	 public static int getLastMoment(int n, int[] left, int[] right) {
		 Arrays.parallelSort(left);
		    Arrays.parallelSort(right);
	        int ans=0;
	        int totalants=left.length+right.length,antsfall=0;
	        int lend=left.length-1,lstart=0,rend=right.length-1;
	         if(right.length>0 && right[rend]==n)
	        	antsfall++;
	        if(left.length>0 && left[lstart]==0)
	        	antsfall++;
	        while(antsfall!=totalants)
	        {
	        	ans++;
	        	for(int i=rend;i>=0;i--) {
	        		if(right[i]==n-1)
	        		{
	        			antsfall++;
	        			rend--;
	        		}
	        		else
	        			right[i]++;
	        	}
	        	
	        	for(int j=lstart;j<=lend;j++) {
	        		if(left[j]==1) {
	        			antsfall++;
	        			lstart++;
	        		}
	        		else
	        			left[j]--;
	        	}
	        	
	        }
	        return ans;
	    }
}
