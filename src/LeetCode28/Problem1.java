package LeetCode28;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] prices=new int[] {10,1,1,6};
       finalPrices(prices);
	}
	
	 public static  int[] finalPrices(int[] prices) {
	     int len=prices.length,i,j,tmp;
		 for(i=0;i<len-1;i++) {
			 j=i+1;
			 while(j<len && prices[j]>prices[i])
				 j++;
			 if(j!=len) 
				 prices[i]=prices[i]-prices[j]; 
		 }
		 
		 return prices;
	    }
}
