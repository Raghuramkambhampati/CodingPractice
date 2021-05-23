package LeetCode219;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stones=new int[] {5,3,1,4,2};
		System.out.println("Answer: "+stoneGameVII(stones));
	}

	
	 public static int stoneGameVII(int[] stones) {
	        boolean turn=true;
	        int a=0,b=0,i=0,j=stones.length-1,score=0;
	        for(int cur:stones)
	        	score+=cur;
	        while(i<=j) {
	           int si=stones[i],sj=stones[j];
	        	if(turn) {
	        		turn=false;
	        		if(si<sj) {
	        			a+=score-si;
	        			score-=si;
	        			i++;
	        		}
	        		else {
	        			a+=score-sj;
	        			score-=sj;
	        			j--;
	        		}
	        		    
	        	}
	        	else
	        	{
	        		turn=true;
	        		if(si>sj) {
	        			b+=score-si;
	        			score-=si;
	        			i++;
	        		}
	        		else {
	        			b+=score-sj;
	        			score-=sj;
	        			j--;
	        		}
	        	}
	        	
	        	 System.out.println("Alice: "+a+" Bob: "+b+"Score: "+score+" I: "+i+" J: "+j);
	        }
     System.out.println("Alice: "+a+" Bob: "+b);
	        return a-b;
	    }
}
