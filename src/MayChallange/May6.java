package MayChallange;

import java.util.HashMap;

public class May6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums=new int[] {2,2,1,1,1,2,2};
      System.out.println("Answer: "+majorityElement(nums));
	}

	
	public static int majorityElement(int[] nums) {
		HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		int ans=0;
	    int len=nums.length;
		for(int num:nums) {
			int count=countMap.getOrDefault(num, 0)+1;
			if(count==len/2+1)
				return num;
			countMap.put(num, count);
		}
		return ans;
	}
}
