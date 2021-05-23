package LeetCode218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Problem4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answer: "+smallestnum("55010"));
	}
	
	public static List<Integer> authEvents1(List<List<String>> events) {
		List<Integer> ans=new ArrayList<Integer>();
		char[] password;
		long hash=0,hash2=0;
		for(List<String> event:events) {
			if(event.get(0)=="setPasssowrd") {
				password=event.get(1).toCharArray();
				int len=password.length;
				for(int i=0;i<len;i++) {
					char ch=password[i];
					hash+=((ch)*pow(131,len-i-1))%1000000007;
					hash2=hash*131;
				}
			}
			
			if(event.get(0)=="authorize") {
				long tmphash=Long.parseLong(event.get(1));
				if(hash==tmphash || tmphash-hash2<128)
					ans.add(1);
				else
					ans.add(0);
			}
		}
		
		
       return ans;
	    }
	public static long pow(int a,int b) {
		long ans=1;
		while(b!=0) {
			ans*=a;
			b--;
		}
	return ans;		
	}
	
	public static List<Integer> authEvents(List<List<String>> events) {
		List<Integer> ans=new ArrayList<Integer>();
		StringBuilder password=new StringBuilder();
		StringBuilder tmppass=new StringBuilder();
		for(List<String> event:events) {
			
			if(event.get(0)=="setPasssowrd") {
				password.setLength(0);
				password=new StringBuilder(event.get(1));
			}
				
			if(event.get(0)=="authorize") {
				long hash=Long.parseLong(event.get(1));
				int rem;
				while(hash!=0) {
					rem=(int)hash%131;
					if(rem>127)
					{
						ans.add(0);
						break;
					}else {
						tmppass.setLength(0);
						tmppass.append((char)rem);
					}
					hash/=131;
				}
			}
			int len1=tmppass.length();
			int len2=password.length();
			if(len1==len2 || len1==len2+1) {
				tmppass=tmppass.reverse();
				for(int i=0;i<len2;i++) {
					if(tmppass.charAt(i)!=password.charAt(i))
					{
						ans.add(0);
						break;
					}
				}
				ans.add(1);
			}else
				ans.add(0);
			
		}
		
		
       return ans;
	    }
	
	
	
	static int[] cutTheSticks(int[] arr) {
	       int len=arr.length,count,i;
	       HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
	       TreeSet<Integer> sticks=new TreeSet<Integer>();
	       for(int stick:arr) {
	    	   count=countMap.getOrDefault(stick,0);
	    	   countMap.put(stick,++count);
	    	   sticks.add(stick);
	       }
	       int[] ans=new int[sticks.size()];
	       count=0;i=0;
	       for(Integer stick:sticks) {
	    	   ans[i++]=len-count;
	    	   count+=countMap.get(stick);
	       }
	       
         return ans;
	    }

	
	
	public static int nonDivisibleSubset(int k, List<Integer> s) {
	      float mid=(float)k/2;
	      int rem,ans=0;
	      int[] remarr=new int[k];
	      for(Integer cur:s){
	          rem=cur%k;
	          remarr[rem]++;
	      }
	      if(remarr[0]!=0)
	    	  ans++;
	      for(int i=1;i<mid;i++)
	    	  ans+=Math.max(remarr[i],remarr[k-i]);
	      if((k%2==0) && remarr[k/2]!=0)
	    	  ans++;
	      
	     return ans;
	    }

	
	
	 public static String smallestnum(String N)
	    {
	      StringBuffer ans=new StringBuffer();
	      int[] digits=new int[10];
	      int tmp,tmp1;
	      char[] str=N.toCharArray();
	      for(char ch:str)
	    	  digits[ch]++;
	      tmp1=digits[0];
	      for(int i=1;i<=9;i++) {
	    	  tmp=digits[i];
	    	  if(tmp!=0) {
	    		  while(tmp!=0)
	    		  {
	    			  ans.append(i);
	    			  if(ans.length()==1) {
	    				  while(tmp1==0) {
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
