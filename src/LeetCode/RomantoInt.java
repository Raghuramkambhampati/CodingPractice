package LeetCode;

import java.util.HashMap;

public class RomantoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String roman="MCMXCIV";
       System.out.println("Answer: "+toInt(roman));
	}

	
	public static int toInt(String s) {
		int ans=0;
		Character ch;
		HashMap<Character,Integer> roman=new HashMap<Character,Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		int len=s.length();
		for(int i=0;i<len;i++) {
			ch=s.charAt(i);
			switch(ch) {
			case 'I':
				if(i<len-1 && s.charAt(i+1)=='V')
					{ans=ans+4;i++;}
				else if(i<len-1 && s.charAt(i+1)=='X')
					{ans=ans+9;i++;}	
				else 
					ans=ans+roman.get(ch);
				break;
			case 'X':
				if(i<len-1 && s.charAt(i+1)=='L')
					{ans=ans+40;i++;}
				else if(i<len-1 && s.charAt(i+1)=='C')
					{ans=ans+90;i++;}	
				else 
					ans=ans+roman.get(ch);
				break;	
			case 'C':
				if(i<len-1 && s.charAt(i+1)=='D')
					{ans=ans+400;i++;}
				else if(i<len-1 && s.charAt(i+1)=='M')
					{ans=ans+900;i++;}
				else 
					ans=ans+roman.get(ch);
				break;
			default:
				ans=ans+roman.get(ch);
			}
		}
		
		
		return ans;
	}
}
