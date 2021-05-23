package LeetCode27;

import java.util.HashSet;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="0000000001011100";
     int k=4;
     System.out.println("Answer: "+hasAllCodes(s,k));
	}

	
	 public static boolean hasAllCodes(String s, int k) {
	        HashSet<String> bcodes=new HashSet<String>();
	        int len=(int)Math.pow(2, k);
	        for(int i=0;i<=s.length()-k;i++) {
	        		bcodes.add(s.substring(i, i+k));
	        	if(len==bcodes.size())
	        		return true;
	        }
	        
	        return false;
	    }
}
