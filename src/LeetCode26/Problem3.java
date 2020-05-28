package LeetCode26;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="cc";
        System.out.println("Answer: "+maxPower(s));
	}

	
	 public static int maxPower(String s) {
		    int[] arr;
		    
	        int ans=1,count=1;
	        for(int i=0;i<s.length()-1;i++) {
	        	if(s.charAt(i)==s.charAt(i+1))
	        	count++;
	        	else {
	        		ans=Math.max(ans,count);
	        		count=1;
	        	}
	        	
	        }
	        ans=Math.max(ans,count);
	        return ans;
	    }
}
