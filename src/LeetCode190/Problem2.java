package LeetCode190;

import java.util.ArrayList;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answwer: "+maxVowels("tryhard",4));
	}
	public static  int maxVowels(String s, int k) {
        ArrayList<Character> vowels=new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
		int ans=0,i=0,j=0,count=0;
		char ch;
		for(i=0,j=0;j<k;j++)
		{
			if(vowels.contains(s.charAt(j)))
				ans++;
		}
		if(ans==k)
			return k;
		count=ans;
		for(;j<s.length();)
		{
			if(vowels.contains(s.charAt(i++)))
				count--;
			if(vowels.contains(s.charAt(j++)))
				count++;
			ans=Math.max(ans, count);
			
		}
		return ans;
    }
}
