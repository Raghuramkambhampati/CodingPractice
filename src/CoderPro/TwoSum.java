package CoderPro;

import java.util.HashMap;

public class TwoSum {

	public static void main(String args[]) {
		int[] arr= new int[] {3,4,5,7,8,10};
		int sum=13;
		int[] ans=twoSum(arr,sum);
		System.out.println("The indicies of the array are:"+ans[0]+" "+ans[1]);
		
	}
	
	
	public static int[]  twoSum(int[] arr,int sum) {
		HashMap<Integer,Integer> arrMap=new HashMap<Integer,Integer>();
		int n;
		for(int i=0;i<arr.length;i++)
			arrMap.put(arr[i], i);
		
		for(int i=0;i<arr.length;i++)
		{
			n=arr[i];
			if(arrMap.containsKey(sum-n))
				return new int[] {arrMap.get(n),arrMap.get(sum-n)};
		}
		
		return new int[]{0,0};
	}
	
	
	
}
