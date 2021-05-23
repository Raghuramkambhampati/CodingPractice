package LeetCode216;

import java.util.Collections;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	     // Write your code here
	      Collections.sort(a);
	      int lena=a.size(),ans=0;
	     long lcm=a.get(lena-1),cur;
	     for(int i=lena-2;i>=0;i--) {
	    	 cur=a.get(i);
	    	 //find lcm between lcm && cur
	    	 while(lcm%cur!=0)
	    		 lcm+=lcm;
	     }

	     //sort the array b
	     Collections.sort(b);
	     int num1=b.get(0);
	     boolean flag=true;
	     for(long tmp=lcm;tmp<=num1;tmp+=tmp) {
	    	 for(Integer numb:b) {
	    		 if(numb%lcm!=0)
	    			 flag=false;
	    	 }
	    	 if(flag)
	    		 ans++;
	     }
	     return ans;
  }
}
