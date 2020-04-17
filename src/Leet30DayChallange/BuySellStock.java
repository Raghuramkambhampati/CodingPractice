package Leet30DayChallange;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Design an algorithm to find the maximum profit. 
		//You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
		//7,1,5,3,6,4-7
		//1,2,3,4,5-4
		//7,6,4,3,1-0
		int[] nums=new int[] {7,6,4,3,1};
		System.out.println("Maximum profit is: "+profit(nums));
	}

	
	public static int profit(int[] prices) {
		int profit=0,startDay,endDay;
		for(int i=0;i<prices.length-1;) {
			startDay=i;
			endDay=i;
			while(i<prices.length-1 && prices[i+1]>prices[i])
				i++;
			endDay=i;
			if(endDay>startDay)
				profit=profit+prices[endDay]-prices[startDay];
			while(i<prices.length-1 && prices[i+1]<=prices[i])
	         i++;			
		}
		return profit;
	}
}
