package LeetCode5479;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums=new int[] {2,4,8,16};
      System.out.println("Anser:"+minOperations(nums));
	}

	
	
public static int minOperations(int[] nums) {
       int ans=0,mulop=0;
       for(int n:nums) {
    	   int count=0;
    	   if(n%2==0) {
    		   ans++;
    		   
    		   while(n!=1)
    		   {
    			   n=n/2;count++;
    		   }
    		   mulop=Math.max(mulop, count);
    	   }
    	   else {
    		   if(n==1)
    			   ans++;
    		   else 
    			   ans=ans+2;
    		   while(n!=1)
    		   {
    			   n=n/2;count++;
    		   }
    		   mulop=Math.max(mulop, count);
    		  
    	   }
       }
       ans=ans+mulop;
       return ans;
    }
}
