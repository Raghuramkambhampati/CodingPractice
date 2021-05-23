package LeetCode203;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] rounds=new int[]{1,3,5,7};
     System.out.println("Answer: "+mostVisited(7,rounds));
	}

	
	
public static  List<Integer> mostVisited(int n, int[] rounds) {
        
	
	//int[]  visited =new int[n];
		/*
		 * int start,end,max=0;
		 * 
		 * for(int i=0;i<=rounds.length-2;i++) { start=rounds[i]-1; end=rounds[i+1]-1;
		 * int j=start; for(j=start;j!=end;j=(j+1)%n) { visited[j]++;
		 * max=Math.max(visited[j], max); } visited[j]++; max=Math.max(visited[j], max);
		 * }
		 */
	List<Integer>  ans=new ArrayList();
	int start=rounds[0]-1;
	int end=rounds[rounds.length-1]-1;
    for(int i=start;i!=end;i=(i+1)%n)
    		ans.add(i+1);
    ans.add(end+1);
    Collections.sort(ans);
	return ans;
    }
}
