package LeetCode208;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] customers=new int[] {10,9,6};
		int boardingCost=6;
		int runningCost=4;
		
		System.out.println("Answer: "+minOperationsMaxProfit(customers,boardingCost,runningCost));
	}
	
	
	 public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
	     int len=customers.length,customerswaiting=0;   
		// int[] profit =new int[Integer.MAX_VALUE/3];
		 int ans=-1,max=0,i,profit=0;
	        for(i=0;i<len;i++) {
	        	customerswaiting=customerswaiting+customers[i];
	        	if(customerswaiting>4) {
	        		profit+=4*boardingCost-runningCost+profit;
	        		customerswaiting=customerswaiting-4;
	        	}
	        	else {
	        		profit+=customerswaiting*boardingCost-runningCost;
	        		customerswaiting=0;
	        	}
	        	
	        	
	        	 if(profit>max) {
	        		 max=profit;
	        		 ans=i+1;
	        	 }
	        }
	        
	        while(customerswaiting>0) {
	        	if(customerswaiting>4) {
	        		profit+=4*boardingCost-runningCost+profit;
	        		customerswaiting=customerswaiting-4;
	        	}
	        	else {
	        		profit+=customerswaiting*boardingCost-runningCost;
	        		customerswaiting=0;
	        	}
	        	 if(profit>max) {
	        		 max=profit;
	        		 ans=i+1;
	        	 }
	        }
	        
	        if(max<0)return -1;
	        
	        return ans; 
	    }
}
