package Leetcode197;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "111111";
		System.out.println("Answer: "+numSub(s));
	}

	
	
public static  int numSub(String s) {
        int len=s.length();
        long ans=0,tmp=0;
        for(int i=0;i<len;) {
           tmp=0;
           while(i<len && s.charAt(i)=='1') {
        	   tmp++;i++;
           }
           if(tmp!=0) 
           ans=(ans+(tmp*(tmp+1))/2)%1000000007;
           else
        	   i++;
          
        }
        
        return (int)ans%1000000007;
    }
}
