package LeetCode25;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Answer: "+diff(9288));
	}

	
	
	public static int diff(int num) {
		int a=0,b=0,digit=0,x=9,y=0,k=0,len=0,tmp=0;
		boolean finda=false,findb=false;
		List<Integer> digits=new ArrayList<Integer>();
		while(num!=0) {
			digits.add(num%10);
			num=num/10;
		}
		len=digits.size();
		for(int i=len-1;i>=0 && (!finda || !findb);i--) {
			digit=digits.get(i);
			if(digit<9 && !finda) {
				x=digits.get(i);
				finda=true;
			}
			if(digit>1 && !findb) {
				 k=i==len-1?1:0;
				 y=digits.get(i);
				 findb=true;
			}
			
		}
		
		//calculate a
		for(int i=len-1;i>=0;i--) {
			digit=digits.get(i);
			if(digit==x)
				a=a*10+9;
			else
			a=a*10+digit;
			if(digit==y)
				b=b*10+k;
			else
			b=b*10+digit;
		}
		
		return a-b;
	}
}
