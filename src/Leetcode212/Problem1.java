package Leetcode212;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] releaseTimes=new int[] {12,23,36,46,62};
		String keysPressed="spuda";
		System.out.println("Answer: "+slowestKey(releaseTimes,keysPressed));
	}

	
	public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans,ch;
        int max,tmp;
        int len=releaseTimes.length;
        	if(len==1)
        		return keysPressed.charAt(0);
        	ans=keysPressed.charAt(0);
        	max=releaseTimes[0];
        for(int i=1;i<len;i++) {
        	tmp=releaseTimes[i]-releaseTimes[i-1];
        	ch=keysPressed.charAt(i);
        	if(tmp>max) {
        		max=tmp;
        		ans=ch;
        	}
        	else if(tmp==max) {
        		if(ch>ans) 
        			ans=ch;
        	}
        }
        return ans;
    }
}
