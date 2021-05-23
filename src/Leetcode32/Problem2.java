package Leetcode32;

import java.util.HashSet;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="input";
		String t="ouput";
		int k=9;
		System.out.println("Ans: "+canConvertString(s,t,k));
	}

	
public static boolean canConvertString(String s, String t, int k) {
       int len1=s.length();
       int len2=t.length();
       int d;
       HashSet<Integer> moves=new HashSet<Integer>();
       if(len1!=len2)
    	   return false;
       for(int i=0;i<len1;i++) {
    	   int val1=s.charAt(i)%96;
    	   int val2=t.charAt(i)%96;
    	   d= val2>=val1 ? val2-val1: 26-val1+val2; 
    	   if(d>0) {
    	   while(d<=k ) {
    		   if(moves.contains(d))
    			   d=d+26;
    		   else
    			   break;
    	   }
    	   if(d>k)
    		   return false;
    		   moves.add(d);
       }
       }
       
       return true;
    }
}
