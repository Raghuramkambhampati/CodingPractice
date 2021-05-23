package LeetCode27;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr=new int[] {3,7,9};
     int[] target=new int[] {3,7,11};
     System.out.println("Answer: "+canBeEqual(arr,target));
	}
	 public static boolean canBeEqual(int[] target, int[] arr) {
	     ArrayList<Integer> dummy=new ArrayList<Integer>();   
		 
	     for(int i=0;i<arr.length;i++)
	    	 dummy.add(arr[i]);
	     
		 for(int i=0;i<target.length;i++) {
			 if(dummy.contains(target[i]))
				 dummy.remove((Integer)target[i]);
			 else
				 return false;
	        }
		 return true;
	    }
	 
}
