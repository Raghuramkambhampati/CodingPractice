package LeetCode;

import java.util.Stack;

public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //()(){}, ({]}),([)],({[]}).
		String s="{[]}";
		System.out.println("Answer: "+isValid(s));
	}

	
	public static boolean isValid(String s) {
		boolean ans=false;
		int len=s.length();
		if(len%2!=0)
			return ans;
		Stack<Character> stk=new Stack<Character>();
		Character ch1,ch2;
		for(int i=0;i<s.length();i++) {
			ch1=s.charAt(i);
			if((ch1=='(')||(ch1=='{')||(ch1=='[')) 
				stk.push(ch1);
			else {
				if(stk.size()==0)
					return ans;
				ch2=stk.peek();
				if(ch1==')' && ch2!='(')
					return ans;
				if(ch1=='}' && ch2!='{')
					return ans;
				if(ch1==']' && ch2!='[')
					return ans;
				stk.pop();
			}
			
		}
		if(stk.size()==0)
			ans=true;
		return ans;
	}
}
