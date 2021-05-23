package Leetcode193;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[] {4,3,1,1,3,3,2};
        System.out.println("Answer: "+findLeastNumOfUniqueInts(arr,3));
	}

	
public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
        ArrayList<Integer> counts=new ArrayList<Integer>();
        int tmp,count,len;	
        for(int i=0;i<arr.length;i++) {
        	tmp=arr[i];
        	count=countMap.getOrDefault(tmp, 0);
        	countMap.put(tmp, ++count);
        }
        //counts=(ArrayList<Integer>)countMap.values();
        for(int t:countMap.values()) 
        	counts.add(t);
        
        Collections.sort(counts);
        for(int i=0;i<counts.size() && k!=0;i++) {
        	count=counts.get(i);
        	if(count<=k) {
        		k=k-count;
        		counts.remove(i);
        		i--;
        	}
        }
        return counts.size();
}
}
