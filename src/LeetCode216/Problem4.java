package LeetCode216;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ranked=new ArrayList<Integer>(){};
		
	}

	
	
	 static int[] breakingRecords(int[] scores) {

		    int max,min,len=scores.length,score;
		    int max_number=0,min_number=0;
		    min=max=scores[0];
            for(int i=1;i<len;i++) {
            	score=scores[i];
            	if(score<min) {
            		min_number++;
            		min=score;
            	}
            	if(score>max) {
            		max_number++;
            		max=score;
            	}
            }
		    System.out.println(max_number+" "+min_number);
		    return new int[] {max_number,min_number};
		    }


	 static int birthday(List<Integer> s, int d, int m) {
         int ans=0,len=s.size(),sum=0,i=0,h,t;
         if(len<m)
        	 return ans;
         for(i=0;i<m;i++)
        	 sum+=s.get(i);
         if(sum==d)
        	 ans++;
         for(;i<len;i++) {
        	 t=s.get(i-m);
        	 h=s.get(i);
        	 sum+=h-t;
        	 if(sum==d)
        		 ans++;
         }
         
       return ans;
	    }


	 
	 static void bonAppetit(List<Integer> bill, int k, int b) {
		    int bactual=0,len=bill.size(),d;
		    for(Integer curbill:bill) 
		    	bactual+=curbill;
		    bactual-=bill.get(k);
		    bactual=bactual/2;
		    d=b-bactual;
		    if(d==0)
		    	System.out.println("Bon Appetit");
		    else
		    	System.out.println(d);

		    }


	 static int pageCount(int n, int p) {
	        /*
	         * Write your code here.
	         */
	         int LPN,RPN,CF,CB;
	          n=n%2==0?n:n-1;
	         if(p%2==0)
	          {
	              RPN=p+1;
	              LPN=p;
	          }
	        else{
	              RPN=p;
	              LPN=p-1;
	        }
	        
	        CF=(RPN-1)/2;
	        CB=(n-RPN)/2;
	        
	        return CF<CB?CF:CB;
	 }

	 
	 
	 static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	        int ans=0,n=keyboards.length,m=drives.length,e1,e2,sum;
	        Arrays.parallelSort(keyboards);
	        Arrays.parallelSort(drives);
	        for(int i=0;i<n;i++) {
	        	e1=keyboards[i];
	        	if(e1>b)
	        		break;
	        	for(int j=0;j<m;j++) {
	        		e2=drives[j];
	        		sum=e1+e2;
	        		if(sum>b)
	        			break;
	        		if(sum<=b && sum>ans)
	        			ans=sum;	
	        	}
	        }
          return ans;
	    }


	 public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		 List<Integer> ans=new ArrayList();
         Set<Integer> ranks=new HashSet<Integer>();
         BigInteger b=new BigInteger("3");
         
            for(int i=0;i<ranked.size();i++) {
                Integer rank=ranked.get(i);
                if(ranks.contains(rank))
                    ranked.remove(i);
                else
                    ranks.add(rank);
            }
            int i=ranked.size()-1;        
           
            for(Integer score:player) {
                while(i>=0 && score.intValue()>ranked.get(i).intValue())
                    i--;
                ans.add(i+2);
            }
            return ans;
    
		    }

	 
	 
	 static void extraLongFactorials(int n) {
	     System.out.println(getFact(n));
	    }
	   
	     static BigInteger getFact(int n){
	         if(n==1)
	          return new BigInteger("1");
	        
	         return getFact(n-1).multiply(BigInteger.valueOf(n));
	     }
}

