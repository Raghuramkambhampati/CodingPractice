package LeetCode203;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] piles=new int[] {2,4,1,2,7,8};
      System.out.println("Answer: "+maxCoins(piles));
	}

	
public static int maxCoins(int[] piles) {
        int ans=0,l=piles.length;
        Arrays.parallelSort(piles);
        for(int i=l/3;i<=l-2;i=i+2)
        	ans=ans+piles[i];
        
        return ans;
    }
}
