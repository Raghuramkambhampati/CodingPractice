package Leetcode193;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr=new int[] {1,10,3,10,2};
     int k=1,m=3;
     System.out.println("Answer:"+minDays(arr,m,k));
	}

	
	 public static int minDays(int[] bloomDay, int m, int k) {
		 if(bloomDay.length<m*k)
			 return -1;
	     int l=0,h=71582788;
	     int  mid,boqs;
	     while(l!=h-1) {
	    	 mid=(l+h)/2;
	    	 boqs=getBouqetsforDay(bloomDay,k,mid);
	    	 if(boqs>=m) h=mid;
	    	 else l=mid;
	     }
		 return h;
	    }
	public static int getBouqetsforDay(int[] bloomDay, int k,int day) {
		int boqs=0,flowers=0,tmpboqs=0;
		for(int d:bloomDay) {
			if(d>=day)
			{
				flowers++;
				if(flowers==k) {
					tmpboqs++;
					flowers=0;
				}
			}
			else
			{
				flowers=0;
				boqs+=tmpboqs;
				tmpboqs=0;
			}
		}
		return boqs;
	}
	 
}
