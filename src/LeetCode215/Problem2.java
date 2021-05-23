package LeetCode215;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Answer: "+closeStrings("iii","iii"));
	}

	
	
	 public static  boolean closeStrings(String word1, String word2) {
		    int len1=word1.length();
		    int len2=word1.length();
		    if(len1!=len2)
		      return false;
		    
	        HashMap<Character,Integer> countmap1=new HashMap<Character,Integer>();
	        HashMap<Character,Integer> countmap2=new HashMap<Character,Integer>();
	       
	        char[] str1arr=word1.toCharArray();
	        char[] str2arr=word2.toCharArray();
	        for(char ch:str1arr) {
	        	int count=countmap1.getOrDefault(ch,0);
	        	countmap1.put(ch,++count);
	        }
	        for(char ch:str2arr) {
	        	int count=countmap2.getOrDefault(ch,0);
	        	countmap2.put(ch,++count);
	        }
	        len1=countmap1.size();
	        len2=countmap2.size();
	        if(len1!=len2)
			      return false;
	        List<Character> str1=new ArrayList<Character>(countmap1.keySet());
	        List<Character> str2=new ArrayList<Character>(countmap2.keySet());
	        Collections.sort(str1);
	        Collections.sort(str2);
	        for(int i=0;i<len1;i++) {
	        	if(str1.get(i)!=str2.get(i))
	        		return false;
	        }
	        
	        List<Integer> values1=new ArrayList<Integer>(countmap1.values());
	        List<Integer> value2=new ArrayList<Integer>(countmap2.values());
	        Collections.sort(values1);
	        Collections.sort(value2);
	        for(int i=0;i<len1;i++) {
	        	if(values1.get(i).intValue()!=value2.get(i).intValue())
	        		return false;
	        }
	        return true;
	    }
}
