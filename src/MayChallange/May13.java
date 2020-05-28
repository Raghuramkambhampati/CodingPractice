package MayChallange;

public class May13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "112";
		int k = 1;
		System.out.println("Answer: "+removeKdigits(num,k));
		
	}

	
	
public static  String removeKdigits(String num, int k) {
      StringBuffer ans=new StringBuffer();
      int len,start,minindex,l,min;
      Character ch;
      len=num.length();
      if(len==k)
    	  return "0";
      minindex=0;start=0;
      while(k!=0)
      {
			/*
			 * if(start+k==len-1) return ans.toString();
			 */
    	 l=start+k;
    	 minindex=start;
    	 min=num.charAt(minindex);
    	 for(int i=start;i<=l;i++) {
    		 if(num.charAt(i)<=min) {
    			 minindex=i;
    			 min=num.charAt(minindex);
    		 }
    	 }
    	 if(minindex==start) {
    		 ch=num.charAt(minindex);
    		 if(ans.length()!=0  || ch!='0')
    			 ans.append(ch);
    		 start++;
    	 }
    	 else
    	 {
    		 k-=minindex-start;
    		 start=minindex;
    	 }
      }
      
      while(start<len) {
    	  ch=num.charAt(start);
 		 if(ans.length()!=0  || ch!='0')
 			 ans.append(ch);
          start++;
      }
      
      return ans.length()!=0?ans.toString():"0";
    }



}
