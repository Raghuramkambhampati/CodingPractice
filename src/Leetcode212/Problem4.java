package Leetcode212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
	    // Write your code here
		/*
		 * HashMap<Integer,HashMap<Character,Integer>> countMap=new
		 * HashMap<Integer,HashMap<Character,Integer>>(); HashMap<Character,Integer>
		 * tmp; int count; int len=dictionary.size(); for(int i=0;i<len;i++) { char[]
		 * str=dictionary.get(i).toCharArray(); tmp=new HashMap<Character,Integer>();
		 * for(char ch:str) { count=tmp.getOrDefault(ch,0); tmp.put(ch, ++count); }
		 * countMap.put(i,tmp); } len=query.size(); for(int i=0;i<len;i++) { char[]
		 * str=query.get(i).toCharArray(); tmp=new HashMap<Character,Integer>();
		 * for(char ch:str) { count=tmp.getOrDefault(ch,0); tmp.put(ch, ++count); }
		 * 
		 * 
		 * }
		 */
		
		int len=dictionary.size(),count;
		HashMap<String,Integer> tmpMap=new HashMap<String,Integer>() ;
		for(int i=0;i<len;i++) {
			char[] strarr=dictionary.get(i).toCharArray();
			Arrays.parallelSort(strarr);
			count=tmpMap.getOrDefault(strarr.toString(),0);
			tmpMap.put(strarr.toString(),++count);
		}
		
		len=query.size();
		List<Integer> ans=new ArrayList(len);
		for(int i=0;i<len;i++) {
			char[] strarr=query.get(i).toCharArray();
			Arrays.parallelSort(strarr);
			if(tmpMap.containsKey(strarr.toString()))
				ans.add(tmpMap.get(strarr.toString()));
			else
				ans.add(0);
		}
		return ans;
	}
	
	/*
	 * public static boolean equal(HashMap<Character,Integer>
	 * map1,HashMap<Character,Integer> map2) { boolean ans=false;
	 * if(map1.size()!=map2.size()) return ans; for(Character ch:map1.keySet()) {
	 * if(map1.get(ch)!=map2.get(ch)) return ans; } return true; }
	 */
	
}


