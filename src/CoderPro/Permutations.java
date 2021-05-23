package CoderPro;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="AFDG";
      printPermutations(s);
	}

	
	
	/*
	 * Permutations
	 * Given group of n elements 
	 * permutations is the number of ways given elements can be arranged in a given group of elements
	 * permutations follow ordering
	 * example A,F,V,H
	 * permutations of 4 elements are
	 *A,F,V,H
	 *
	 */
	
	
	
	public static void printPermutations(String s) {
		recursiveMethod(s.toCharArray(),0,s.length());
	}
	
	
	public static void recursiveMethod(char[] s,int start,int len) {
		if(start==len-1)
		{
			System.out.println(s);
			return;
		}
		char tmp;
		for(int i=start;i<len;i++) {
			tmp=s[i];
			s[i]=s[start];
			s[start]=tmp;
			recursiveMethod(s,start+1,len);
			tmp=s[i];
			s[i]=s[start];
			s[start]=tmp;
		}
	}
}
