package LeetCode215;

import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int d1=0;
	    int d2=0;
	    int len=arr.size();
	    
	    for(int i=0;i<len;i++) {
	    	List<Integer> tmp=arr.get(i);
	    	d1+=tmp.get(i);
	    	d1+=tmp.get(len-i-1);
	    }

	    
	    
	    return Math.abs(d1-d2);
	    }
}
