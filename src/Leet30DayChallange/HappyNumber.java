package Leet30DayChallange;

import java.util.LinkedList;
import java.util.List;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //num happy number
		int num=1000;
		System.out.println("Answer: "+isHappy(num));
	}

	 public static boolean isHappy(int n) {
		 if(n<0)
				return false;
	     int sum;
	     List<Integer> nums=new LinkedList<Integer>();
	     nums.add(n);
	     while(true) {
	     sum=squareDigit(n);
		 if(sum==1)
			 return true;
		 else if(nums.contains(sum))
		 return false;
		 else
			 nums.add(sum);
		 n=sum;
	     }
	    }
	 
	 public static int squareDigit(int n) {
		 int sum=0,r;
		 while(n!=0)
		 {
			 r=n%10;
			 sum=sum+r*r;
			 n=n/10;
		 }
		 return sum;
	 }
	 
}
