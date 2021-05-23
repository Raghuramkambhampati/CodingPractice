package LeetCode207;

import java.util.LinkedList;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answer: ["+reorderSpaces("a")+"]");
	}

	
	
public static String reorderSpaces(String text) {
        String ans="";
        int spaces=0,len=text.length(),s;
        List<String> words=new LinkedList<String>();
        StringBuffer sb=new StringBuffer();
        char[] textChar=text.toCharArray();
        for(int i=0;i<len;i++) {
        	char ch=text.charAt(i);
        	if(ch==' ')
        		spaces++;
        	else {
        		sb.append(ch);
        		if(i==len-1 || text.charAt(i+1)==' ')
        		{
        			words.add(sb.toString());
        			sb.delete(0, sb.length());
        		}
        	}	
        }
        s=words.size()==1?1:spaces/(words.size()-1);
        char[] spaceString=new char[s];
        for(int i=0;i<s;i++)
        	spaceString[i]=' ';
        sb.delete(0, sb.length());
        len=words.size();
        for(int i=0;i<len;i++) {
        	sb.append(words.get(i));
        	if(i!=len-1)
        	sb.append(spaceString);
        }
        len=text.length()-sb.length();
        for(int i=0;i<len;i++)
        	sb.append(' ');
        
        return sb.toString();
    }
}
