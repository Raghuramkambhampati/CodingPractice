package LeetCode206;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int strStr(String haystack, String needle) {
	        int l1=haystack.length();
	        int l2=needle.length();
	        int ans=-1;
	        if(l1<l2)
	        	return ans;
	        if(l1==l2)
	        	return haystack==needle?0:-1;
	        char[] hayarray=haystack.toCharArray();
	        char[] needlearray=needle.toCharArray();
	        int i,j;
	        for(i=0;i<l1;i++) {
	        	for(j=0;j<l2;j++) {
	        		if(hayarray[i]!=needlearray[j])
	        			break;
	        	}
	        	if(j==l2)
	        		return j;
	        } 
	        return ans;
	    }
}
