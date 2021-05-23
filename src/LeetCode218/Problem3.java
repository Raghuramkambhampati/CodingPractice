package LeetCode218;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answer: "+smallestnum("55010"));
	}

	
	
public static int concatenatedBinary(int n) {
        long ans=0,pow=2,len=0;
        for(int i=1;i<=n;i++) {
        	if(i%2==0)
        		pow=pow*2;
        	ans=ans*pow+n;
        	ans%=1000000007;
        }
        
        return (int)ans%1000000007;
    }

static int squares(int a, int b) {
    int ans=0; 
		
 
   if(a>b)
	   return 0;
   
   int i;
   for(i=0;i*i<a;i++);
   if(i*i==a) {
	   if(a==b)
		   return 1; 
   }  
   else {
	   if(a==b)
		   return 0;
   }
   a=i-1; 
   for(;i*i<b;i++);
   if(i*i==b)
	   b=i;
   else
      b=i-1;
    return b-a;
}


public static String smallestnum(String N)
{
  StringBuffer ans=new StringBuffer();
  int[] digits=new int[10];
  int tmp,tmp1;
  char[] str=N.toCharArray();
  for(char ch:str)
	  digits[Character.getNumericValue(ch)]++;
  tmp1=digits[0];
  for(int i=1;i<=9;i++) {
	  tmp=digits[i];
	  if(tmp!=0) {
		  while(tmp!=0)
		  {
			  ans.append(i);
			  if(ans.length()==1) {
				  while(tmp1!=0) {
					  ans.append(0);
					  tmp1--;
				  }
					  
			  }
			  tmp--;
		  }
	  }
  }
  
  
  return ans.toString();
}




}
