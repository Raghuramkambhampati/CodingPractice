package LeetCode196;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public static  boolean canMakeArithmeticProgression(int[] arr) {
	    Arrays.parallelSort(arr);
	    for(int i=1;i<arr.length-1;i++) {
	    	if(arr[i]-arr[i-1]!=arr[i+1]-arr[i])
	    		return false;
	    }
	return true;
    }
}
