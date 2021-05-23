package LeetCode5479;

import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answer:"+thousandSeparator(1234));
	}

	
public static String thousandSeparator(int n) {
        StringBuffer s=new StringBuffer();
        Stack<Character>  str=new Stack<Character>();
        int r,count=0,l;
        Character ch;
        if(n==0)
        	return "0";
        if(n<0)
        	s.append("-");
        n=Math.abs(n);
        while(n!=0) {
        	r=n%10+48;
        	str.push((char)r);
        	n=n/10;
        }
        l=str.size();
        while(str.size()!=0) {
        	ch=str.pop();
        	s.append(ch);
        	count++;
        	if((l-count)%3==0 && str.size()!=0)
        		s.append('.');
        }
       
        return s.toString();
    }
}
