package LeetCode189;

import java.util.Arrays;
import java.util.Comparator;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String line="To be or not to be";
       System.out.println("Answer: "+arrangeWords(line));
	}

	
	 public static  String arrangeWords(String text) {
	        StringBuffer ans=new StringBuffer();
	        String[] words=text.split(" ");
	        words[0]=words[0].toLowerCase();
	        MyString[] wordString=new MyString[words.length];
	        for(int i=0;i<words.length;i++) {
	        	wordString[i]=new MyString(words[i],words[i].length(),i);
	        }
	        Arrays.sort(wordString, new SortLen()); 
	        wordString[0].str=wordString[0].str.substring(0, 1).toUpperCase() +wordString[0].str.substring(1).toLowerCase();
	        for(MyString word:wordString)
	        	ans.append(word.str+" ");
	        
	        return ans.toString().trim();
	    }
}


class MyString{
	String str;
	int len;
	int index;
	MyString(String str,int len,int index){
		this.str=str;
		this.len=len;
		this.index=index;
	}
}

class SortLen implements Comparator<MyString> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(MyString a, MyString b) 
    { 
    	int ans= a.len - b.len;
        return ans==0?a.index-b.index:ans; 
    } 
} 