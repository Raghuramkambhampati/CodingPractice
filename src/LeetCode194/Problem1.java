package LeetCode194;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Answer "+xorOperation(10,5));
	}

	
	
	 public static  int xorOperation(int n, int start) {
	        int ans=0;
	        for(int i=0;i<n;i++) 
	        	ans=ans^(start+2*i);
		 return ans;
	    }
}
