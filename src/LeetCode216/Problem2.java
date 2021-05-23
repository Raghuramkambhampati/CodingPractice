package LeetCode216;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums=new int[] {1,2,3};
      System.out.println("Answer: "+waysToMakeFair(nums));
	}

	
	
public static int waysToMakeFair(int[] nums) {
        int ans=0,len=nums.length;
        int es=0,os=0,tmp;
        for(int i=0;i<len;i++) {
        	if(i%2==0)
        		es+=nums[i];
        	else
        		os+=nums[i];
        }
        tmp=es;
        es=os;
        os=tmp;
        os=os-nums[0];
        if(es==os)
        	ans++;
        
        for(int i=1;i<len;i++) {
                 if(i%2==0) {
                	 os=os-nums[i]+nums[i-1];
                	 if(es==os)
                		 ans++;
                 }
                 else {
                	 es=es-nums[i]+nums[i-1];
                	 if(es==os)
                		 ans++;
                 }
        }
        
        
        return ans;
    }
}
