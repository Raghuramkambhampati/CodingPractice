package LeetCodeWeek189;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ab123";
		System.out.println("Answer: "+Sol(str));
		
	}

	
	public static String Sol(String str) {
		StringBuffer ans=new StringBuffer("");
		Character ch;
		int alphaCount=0,numCount=0,diff=0;
		ArrayList<Character> alphaList= new ArrayList<Character>();
		ArrayList<Character> numList= new ArrayList<Character>();

		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				alphaCount++;
				alphaList.add(ch);
			}
			if(ch>='0' && ch<='9')
			{
				numCount++;
				numList.add(ch);
			}
		}
		diff=alphaCount-numCount;
		
		if((diff==0)||(diff==1)||(diff==-1))
		{
			int i=0,j=0;
			if(diff>=0)
			{
			while(ans.length()!=str.length()) {
				if(i<alphaList.size())
				ans.append(alphaList.get(i++));
				if(j<numList.size())
				ans.append(numList.get(j++));
			}
		}
			else {
				while(ans.length()!=str.length()) {
					if(j<numList.size())
						ans.append(numList.get(j++));
					if(i<alphaList.size())
					ans.append(alphaList.get(i++));
				}
			}
		}
		return ans.toString();
	}
	
}
