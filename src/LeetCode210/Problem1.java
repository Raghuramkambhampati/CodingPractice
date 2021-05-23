package LeetCode210;

import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Answer "+maxDepth("1"));
	}

	
	
public static int maxDepth(String s) {
        int ans=0;
        Stack st=new Stack();
        for(char ch:s.toCharArray()) {
        	if(ch=='(') {
        		st.push(ch);
        	}
               if(ch==')') {
        		ans=Math.max(ans, st.size());
        		st.pop();
        	}
        	
        }
        
        return ans;
    }
}
