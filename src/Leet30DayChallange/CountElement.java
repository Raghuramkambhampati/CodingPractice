package Leet30DayChallange;

import java.util.ArrayList;
import java.util.HashSet;

public class CountElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //0,1,2,3
	   //2,4,6,8,10,20
	   //1,1,2,2,3,3,4,6,7,8,8
		int[] nums=new int[] {1,3,2,3,5,0};
		System.out.println("Anser is "+ count(nums));
	}

	
	//
	public static int count(int[] arr) {
		int ans=0;Integer tmp;
		HashSet<Integer> numList=new HashSet<Integer>();
		  for(int i=0;i<arr.length;i++) 
			  numList.add(arr[i]);
		  
	      for(int i=0;i<arr.length;i++) {
	    	tmp=arr[i];
	    	if(numList.contains(tmp+1)) {
	    		ans++;
	    	}
	    }
		return ans;
	}
}
