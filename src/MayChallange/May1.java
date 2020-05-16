package MayChallange;

public class May1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
  public static int firstBadVersion(int n) {
         return firstBadVersion(0,n);
    }
  
  public static int firstBadVersion(int low,int high) {
	 int  mid=(high+low)/2;
	 if(isBadVersion(mid)) {
		 if(mid==low || !isBadVersion(mid-1))
			 return mid;
		 return firstBadVersion(0,mid-1);
	 }
	 else {
		 if(mid==high || isBadVersion(mid+1))
			 return mid;
		 return firstBadVersion(mid+1,high);
	 }
 }
  
 public static  boolean isBadVersion(int version) {
	 return true;
 }; 
}
