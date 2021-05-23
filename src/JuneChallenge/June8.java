package JuneChallenge;

public class June8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Answer: "+isPowerOfTwo(8));
	}
	 
	public static  boolean isPowerOfTwo(int n) {
	      while(n%2==0) {
	    	  n=n/2;
	    	  if(n==1)
		    	  return true;
	      }
		  return false;
	    }
}
