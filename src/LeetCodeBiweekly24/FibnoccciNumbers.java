package LeetCodeBiweekly24;

import java.util.HashMap;

public class FibnoccciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=fibNums(19);
       System.out.println("Answer: "+ ans);
	}

	public static int fibNums1(int n) {
		int ans;
		HashMap<Integer,Integer> fibNums= new HashMap<Integer,Integer>();
		int n1=1,n2=1,n3,e2,sum,e1,i=0;
		fibNums.put(i, n1);
		fibNums.put(++i, n2);
		while(true) {
			n3=n1+n2;
			e1=n3;
			e2=n-e1;
			sum=0;
			ans=1;
			while(fibNums.containsValue(e2)) {
				ans++;
				sum=e2+e1;
				if(sum==n)
					return ans;
				e2=n-sum;
				e1=sum;
			}
		    fibNums.put(++i,n3);
			n1=n2;
			n2=n3;
		}
	}
	
	
	
	public static int fibNums(int n) {
		int ans=0;
		
		
		return ans;
	}
}
