package LeetCode25;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //input:
		//input:
		//input:
		//input:
		//input:
		int[] candies=new int[] {12,1,12};
		int extraCandies=10;
		List<Boolean> ans=new ArrayList<Boolean>();
		ans=Sample(candies,extraCandies);
		for(int i=0;i<ans.size();i++) 
		System.out.println("->"+ans.get(i));
	}

	
	
	public static  List<Boolean>  Sample(int[] candies, int extraCandies) {
		List<Boolean> ans=new ArrayList<Boolean>();
		int max=0;
		for(int i=0;i<candies.length;i++)
			max=Math.max(candies[i], max);
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i]+extraCandies>=max)
				ans.add(true);
			else
				ans.add(false);
		}
		return ans;
	}
}
