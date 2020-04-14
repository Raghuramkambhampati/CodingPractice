package CoderPro;
/*
 * problem is given an array in sorting order and should return the first and last index of the appearance of the number
 * the number will appear more than twice
 */
public class FirstLastNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[] {10,20,30,35,40,66,66,66,100,105,375};
       int num=66;
       int[] ans=new int[2];
       //ans=bruteforce(arr,num);
       ans=binaryAlgo(arr,num,0,10,ans);
       System.out.println("First occurance of number "+num+" is: "+ans[0]);
       System.out.println("Last occurance of number "+num+" is: "+ans[1]);
	}

	
	/***
	 * the first approach is brute force approach
	 * traversing through the array and checking for the first and last element
	 * Time complexity of the alogrithm is o(n)  in the worst case.
	 */
	public static int[] bruteforce(int[] arr,int num) {
	    
		int[] ans=new int[2];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==num) {
				if(i==0 || arr[i-1]!=num)
					ans[0]=i;
				if(i==arr.length-1 || arr[i+1]!=num) {
					ans[1]=i;
					break;
				}
			}
			
		}
		
		return ans;
	}
	
	
	/*
	 * Using the binary reduces the time complexity of the algorithm to log(n) times.
	 * 
	 */
	public static int[] binaryAlgo(int[] arr,int num,int low,int high,int[] ans) {
		
		int mid= (high+low)/2;
		if(num==arr[mid])
		{
			int tmp;
			tmp=mid;
			while(!(num==arr[tmp] && num!=arr[tmp-1]) || tmp==0)
				tmp--;
			ans[0]=tmp;
			tmp=mid;
			while(!(num==arr[tmp] && num!=arr[tmp+1]) || tmp==arr.length)
				tmp++;
			ans[1]=tmp;
			return ans;
		}
			
		else if(num<arr[mid])
			return binaryAlgo(arr,num,low,mid-1,ans);
		else
			return binaryAlgo(arr,num,mid+1,high,ans);
	}
}
