package CoderPro;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input 
		int[] arr= new int[]{10,20,30,40,50,60};
		int ele=40;
		int ans=BinarySearch(arr,ele,0,5);
		System.out.println("Answer :"+ans);
	}

	
	
	public static int BinarySearch(int[] arr,int ele,int low,int high) {
		int ans;
		int mid= (low+high)/2;
		if(ele==arr[mid])
              return mid;
		else if(ele<arr[mid])
			return BinarySearch(arr,ele,low,mid-1);
		else
			return BinarySearch(arr,ele,mid+1,high);
	}
}
