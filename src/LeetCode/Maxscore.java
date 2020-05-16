package LeetCode;

import java.util.HashMap;

public class Maxscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="00";
       System.out.println("Answer: "+max(s));
	}

	
	
	public static int max(String s) {
		int ans=0,tcount0=0,tcount1=0;
		Character ch;
		for(int i=0;i<s.length();i++ ) {
			ch=s.charAt(i);
			if(ch=='0')
				tcount0++;
			else 
				tcount1++;
		}
		
		int lc0=0,lc1=0,rc0=tcount0,rc1=tcount1;
		ans=0;
		for(int i=0;i<s.length()-1;i++ ) {
			ch=s.charAt(i);
			if(ch=='1') {
				lc1++;
				rc1--;
			}
			if(ch=='0') {
				lc0++;
				rc0--;
			}
			ans=Math.max(lc0+rc1,ans);
		}
		
		return ans;
	}
}
