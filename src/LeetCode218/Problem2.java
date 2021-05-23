package LeetCode218;

import java.util.HashMap;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
public static int maxOperations(int[] nums, int k) {
        int ans=0,count,key1,val1,key2,val2;
        HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
       
        for(int cur:nums) {
        	count=countMap.getOrDefault(cur,0);
        	countMap.put(cur,++count);
        	
        }
        for(Integer key:countMap.keySet()) {
        	key1=key.intValue();
        	key2=k-key;
        	val1=countMap.get(key);
        	if(key1==key2) {
        		ans+=val1/2;
        		countMap.put(key1, val1%2);
        	}
        	else {
        		if(countMap.containsKey(key2)) {
        			val2=countMap.get(key2);
        			count=Math.min(val1,val2);
        			ans+=count;
        			countMap.put(key1,val1-count);
        			countMap.put(key2,val2-count);
        		}
        	}
        	
        }
        return ans;
    }
}
