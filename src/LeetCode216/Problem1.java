package LeetCode216;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1= {"a","bc"};
		String[] word2= {"ab","c"};
		arrayStringsAreEqual(word1,word2);
	}

	
	
	
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        StringBuffer sb1=new StringBuffer();
	        StringBuffer sb2=new StringBuffer();
	        for(String word:word1)
	        	sb1.append(word);
	        for(String word:word2)
	        	sb2.append(word);
	        if(sb1.length()!=sb2.length())
	        	return false;
	        
	        return sb1.toString().equals(sb2.toString());
	    }
}
