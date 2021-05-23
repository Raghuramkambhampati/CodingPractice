package LeetCode;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
public static String longestPalindrome(String s) {
    int len=s.length();
    if(len==0||len==1)
    	return s;
    int i,j,k,l,a=0,b=len;
    for(i=0,j=len;i<len-1;i++) {
    	k=i;l=len-1;
    	while(k<l) {
    		if(s.charAt(k)!=s.charAt(l))
    			break;
    		else
    		{
    			k++;
    			i--;
    		}
    	}
    	if(k>l)
    	{
    		
    	}
    }
	
	
	return s.substring(a, b);
    }
}
