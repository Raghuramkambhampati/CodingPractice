package LeetCode218;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Answer: "+interpret("(al)G(al)()()G"));
	}

	
	
public static String interpret(String command) {
        StringBuffer ans=new StringBuffer();
        char[] commandarr=command.toCharArray();
        int len=command.length();
        char ch;
        for(int i=0;i<len;) {
        	ch=commandarr[i];
        	if(ch=='G') {
        		ans.append('G');
        		i++;
        	}
        	else 
        	{
        		ch=commandarr[i+1];
        		if(ch==')') {
        			ans.append('o');
            		i=i+2;
        		}
        		else
        		{
        			ans.append("al");
            		i=i+4;
        		}
        	}
        }
        
        return ans.toString();
    }
}
