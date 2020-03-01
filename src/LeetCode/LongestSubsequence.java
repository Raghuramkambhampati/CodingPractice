package LeetCode;

import java.util.HashMap;

public class LongestSubsequence {

	public static void main(String[] args) {
	
		//abacabcbb
		//" "
		System.out.print(lengthOfLongestSubstring(""));

	}

	public static int lengthOfLongestSubstring(String s) {
        int count,max=0,j;
        HashMap<Integer,Character> myMap=new HashMap<Integer, Character>();
        
        for(int i=0;i<s.length();i++){
            count=0;
            myMap.clear();
          for(j=i;j<s.length();j++){
            Character c=s.charAt(j);
            Integer k=new Integer(j);
            if(myMap.containsValue(c)){
                break;
            }
            count++;
            myMap.put(k,c);
        }
          
          if(count>max){
              max=count;
           }  
    }
        return max;   
    }
	
}
