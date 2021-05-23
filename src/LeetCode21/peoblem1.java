package LeetCode21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class peoblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbbcccc";
		System.out.println("Answer "+solution(s));

	}
	
	
	public static String solution(String s) {
		Character ch;
		String s1,s2;
		StringBuffer ans=new StringBuffer();
		Integer tmp;
		ArrayList<String>  uniqchars=new ArrayList<String>();
		HashMap<String,Integer> countmap=new HashMap<String,Integer>();
		//construct list containing unique characters from string
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);	
			s1=ch.toString();
			if(!uniqchars.contains(s1))
			  uniqchars.add(ch.toString());
			int count = countmap.containsKey(s1) ? countmap.get(s1) : 0;
			countmap.put(s1, count + 1);
			
		}
		Collections.sort(uniqchars);
		while(countmap.size()!=0) {
			//put the chars in ascending order 
			for(int i=0;i<uniqchars.size();i++) {
				s2=uniqchars.get(i);
				if(countmap.containsKey(s2)) {
				 ans.append(s2);
				 int count =  countmap.get(s2);
				 if(count==1)
					 countmap.remove(s2);
				 else
					 countmap.put(s2, count-1);
				}
			}
			
			//put the chars in descending order
			for(int i=uniqchars.size()-1;i>=0;i--) {
				s2=uniqchars.get(i);
				if(countmap.containsKey(s2)) {
				 ans.append(s2);
				 int count =  countmap.get(s2);
				 if(count==1)
					 countmap.remove(s2);
				 else
					 countmap.put(s2, count-1);
				}
			}
			
		}
		
		return ans.toString();
	}
	
  //abccbaabccba
 //abccbaabccbaabc
}
