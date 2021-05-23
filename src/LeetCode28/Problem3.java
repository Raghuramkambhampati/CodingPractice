package LeetCode28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {7,3,4,7};
		minSumOfLengths(nums,7); 
	}
public static int minSumOfLengths1(int[] arr, int target) {
    int len=arr.length,sum=0;
    ArrayList<Integer> ans=new ArrayList<Integer>();
	for(int i=0;i<len-1;i++) {
		sum=0;
		for(int j=i;j<len-1 || sum!=target;j++ )
		  sum+=arr[j];
	}
	Collections.sort(ans);
	return ans.size()<2?-1:(ans.get(0)+ans.get(1));
    }

public static int minSumOfLengths(int[] arr, int target) {
	 int N = arr.length, inf = Integer.MAX_VALUE/3;
     HashMap<Long, Integer> mp = new HashMap<>();
     long sum = 0;
     mp.put(0l, -1);
     int min = inf;
     int[] le = new int[2+N], ri = new int[2+N];
     le[0] = min;
     for(int i = 0; i< N; i++){
         sum += arr[i];
         if(mp.containsKey(sum-target))
             min = Math.min(min, i-mp.get(sum-target));
         mp.put(sum, i);
         le[i+1] = min;
     }
     mp = new HashMap<>();
     sum = 0;
     mp.put(sum, N);
     min = inf;
     ri[N] = inf;
     for(int i = N-1; i >= 0; i--){
         sum += arr[i];
         if(mp.containsKey(sum-target))min = Math.min(min, mp.get(sum-target)-i);
         mp.put(sum, i);
         ri[i+1] = min;
     }
     int ans = inf;
     for(int i = 1; i< N; i++){
         ans = Math.min(ans, le[i]+ri[i+1]);
     }
     if(ans == inf)return -1;
     return ans;
}
}
