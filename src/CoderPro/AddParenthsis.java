package CoderPro;

import java.util.ArrayList;

public class AddParenthsis {

	
	static ArrayList<StringBuffer> ans=new ArrayList<StringBuffer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  getStrings(3,0,0,new StringBuffer());
		 for(StringBuffer s:ans)
			 System.out.println(" "+s.toString());
	}

	
	
	/*
	 * Problem: given an number n. find all the valid combinations of the character n- left parenthesis and n right parenthesis.
	 *
	 * 
	 */
	
	
	
	/*
	 * Approach: Brute force Approach  Construct a string from empty length to length of n 
	 * TC: O(2^n)
	 * SC: O(2^n)
	 */
	
	public static void  getStrings(int n,int left, int right,StringBuffer s){
		if(left+right==2*n) {
			ans.add(s);
			// s.delete(0, s.length());
			return;
		}
		if(left<n) 
			getStrings(n,left+1,right,s.append('('));
		if(right<left)
			getStrings(n,left,right+1,s.append(')'));
		return;
	}
}
