package AugChallenge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aug18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numsSameConsecDiff(2,1);
	}

	
  public static int[]  numsSameConsecDiff(int N, int K) {
       List<Integer> ans=new LinkedList<Integer>();
       
       int num;
      for(int i=1;i<=9;i++) {
    	  int[] tmp=new int[N];
    	  tmp[0]=i;
    	  adddigits(ans,tmp,i,1,K);
      }
      if(N==1) ans.add(0);
       Collections.sort(ans);
       int[] ansarr=new int[ans.size()];
       for(int i=0;i<ans.size();i++)
    	   ansarr[i]=ans.get(i);
       return ansarr;
    }
  
  
  public static void adddigits(List<Integer> ans,int[] tmp,int cur,int n,int k) {
	// if(n>tmp.length) return;
	  if(n==tmp.length) {
		  int num=0;
		  for(int i=0;i<tmp.length;i++)
			   num=num*10+tmp[i];
		  if(!ans.contains(num))
		  ans.add(num);
		  return;
	  }
	  
	  if((0<=cur+k) && (cur+k<=9)) { tmp[n]=cur+k;adddigits(ans,tmp,cur+k,n+1,k);}
	  if((0<=cur-k) && (cur-k<=9)) { tmp[n]=cur-k;adddigits(ans,tmp,cur-k,n+1,k);}
  }
}
