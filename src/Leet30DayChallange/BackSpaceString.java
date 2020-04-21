package Leet30DayChallange;

import java.util.Stack;

public class BackSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //compare two strings 
		String S="a##c";
		String T="#a#c";
		System.out.println("Answer: "+solution(S,T));
	}

	
	
	public static boolean solution(String S,String T) {
		Stack<Character> s1=new Stack<Character>();
		Stack<Character> s2=new Stack<Character>();
		Character ch;
		boolean ans=false;
		int i;
		for(i=0;i<S.length();i++)
		{
			ch=S.charAt(i);
			if(ch=='#' && s1.size()>=1)
				s1.pop();
			if(ch!='#')
				s1.push(ch);
		}
		
		
		for(i=0;i<T.length();i++)
		{
			ch=T.charAt(i);
			if(ch=='#' && s2.size()>=1)
				s2.pop();
			if(ch!='#')
				s2.push(ch);
		}
		int n1=s1.size();
		int n2=s2.size();
		if(n1==n2) {
			for(i=0;i<n1;i++) {
				if(s1.pop()!=s2.pop())
					break;
			}
		
			if(i==n1)
			ans=true;
		}
		return ans;
	}
}
