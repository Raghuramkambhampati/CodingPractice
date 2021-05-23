package LeetCode204;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[]  nums= {1,2,3,5,-6,4,0,10};
   System.out.println("answer:"+getMaxLen(nums));
	}

	
public  static int getMaxLen(int[] nums) {
    int len=nums.length,ans=0,p=1,start=0;    
	for(int i=0;i<len;i++) {
		if(nums[i]==0)
			start=i+1;
		if(nums[i]<0)
			p=p*-1;
		if(p>0)
			ans=Math.max(ans,i-start+1);
	}
  return ans;    
}
}
