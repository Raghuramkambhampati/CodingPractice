package LeetCode21;

import java.util.HashMap;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public static int longestSubStringWithVowels(String s) {
		
		char ch;
		int ans=s.length();
		
		HashMap<Character,Integer> countMap=new HashMap<Character,Integer>();
		countMap.put('a', 0);
		countMap.put('e', 0);
		countMap.put('i', 0);
		countMap.put('o', 0);
		countMap.put('u', 0);
		
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(countMap.containsKey(ch)) {
				int count = countMap.get(ch);
				countMap.put(ch, count + 1);
			}
		}
		
		if(evenCount(countMap))
			return ans;
		
		
		
		
		return 1;
	}
	
	public static boolean evenCount(HashMap<Character,Integer> countMap) {
		
		for(Integer n:countMap.values()) {
			if(n%2!=0)
				return false;
		}
		return true;
	}
}
