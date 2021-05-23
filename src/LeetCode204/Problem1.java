package LeetCode204;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,2,4,4,4,4};
  System.out.println("answer: "+containsPattern(arr,1,3));
	}

	
	
	
public static boolean containsPattern(int[] arr, int m, int k) {
        boolean ans=false;
        int len=arr.length;
        if(m*k>len)
        	return false;
        if(k==1 && m<=len)
        	return true;
        for(int i=0;i<len;i++) {
        	if(checkPattern(arr,i,k,m))
        		return true;
        }
        return false;
    }

public static boolean checkPattern(int[] arr,int start,int k,int m) {
	int next;
	int end=start+m-1;
	if(end>arr.length)
		return false;
	for(int curr=start;curr<=end;curr++) {
		for(int j=1;j<k;j++) {
			next=curr+m*j;
			if(next>=arr.length)
				return false;
			if(arr[start]!=arr[next])
				return false;
		}
	}
	return true;
}
}
