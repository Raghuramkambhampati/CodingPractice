package LeetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //123,23456,12321,102353201,123456789
		//-123,-467898764,
		int n=-102353201;
		System.out.println("Answer: "+ isPalindrome(n));
	}

	
	public static  boolean isPalindrome(int n) {
		if(n<0)
			return false;
		int rev=0,tmp=n;
		while(tmp!=0) {
			rev=rev*10+tmp%10;
		    tmp=tmp/10;
		}
		if(rev==n)
		return true;
	   return false;
	}
}
