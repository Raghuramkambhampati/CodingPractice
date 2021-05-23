package LeetCode201;

import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("Answer: "+makeGood(""));
	}

	
	
public static String makeGood(String s) {
        char[] chans=new char[] {};
        char tmp,top;
        Stack<Character> ans=new Stack<Character>();
        int len=s.length();
        for(int i=0;i<len;i++) {
        	tmp=s.charAt(i);
        	if(ans.size()==0)
        		ans.push(tmp);
        	else
        	{
        		top=ans.peek();
        		if(tmp==top+32 || top==tmp+32)
        			ans.pop();
        		else
        			ans.push(tmp);
        	}
        }
        int stklen=ans.size();
        chans=new char[stklen];
        for(int i=0;i<stklen;i++)
        	chans[i]=ans.get(i);
        
        
        return String.valueOf(chans);
        }
}
