package LeetCode24;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums=new int[] {1,-2,-3};
       System.out.println("Answer "+minPosValue(nums));
	}


	public static int minPosValue(int[] nums) {
		/*
		 * int ans=1,sum,tmpsum,prevans; sum=ans; for(int i=0;i<nums.length;i++) {
		 * tmpsum=sum+nums[i]; if(tmpsum<=0) { prevans=ans; ans=ans-tmpsum+1;
		 * sum=sum+ans-prevans; } sum=sum+nums[i]; }
		 */
		int u=0,s=0;
        for(int i=0;i<nums.length;++i)
        {
            u+=nums[i];
            s=Math.max(s,-u);
        }
        return s+1;
	}
	
}
