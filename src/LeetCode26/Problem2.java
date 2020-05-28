package LeetCode26;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplifiedFractions(6);
	}

	
public static List<String> simplifiedFractions(int n) {
	List<String> ans=new ArrayList<String>();
	for(int num=1;num<n;num++) {
		for(int den=num+1;den<=n;den++) {
			int gcd=1;
			 for(int i = 1; i <= num && i <= den; i++)
		        {
		            if(num%i==0 && den%i==0)
		                gcd = i;
		        }

			if(gcd==1)
				ans.add(num+"/"+den);
		}
	}
	
	return ans;
    }
}
