package LeetCode219;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Answer: "+numberOfMatches(14));
	}

	
	
	 public static int numberOfMatches(int n) {
	        int ans=0;
	        
	        while(n>1) {
	        	ans+=n/2;
	        	n=n/2+n%2;
	        }
	        
	        return ans;
	    }
}
