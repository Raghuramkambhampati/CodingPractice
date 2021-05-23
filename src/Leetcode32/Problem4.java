package Leetcode32;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr=new int[]{2,3,4,7,11};
      int k=5;
      System.out.println("Answer: "+findKthPositive(arr,k));
	}

	
	
public static int findKthPositive(int[] arr, int k) {
        int count=0,i=1,len=arr.length;
        for(int j=0;count!=k;i++) {
        	
        	if(j<len && arr[j]==i)
        		j++;
        	else
            	count++;
        }
        
        return i-1;
    }
}
