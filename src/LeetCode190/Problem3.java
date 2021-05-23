package LeetCode190;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Anser: "+isPrefixOfWord("i love eating burger","burg"));
	}

	 public static int isPrefixOfWord(String sentence, String searchWord) {
	        int ans=-1,i=0;
	        int len=searchWord.length();
		 String[] words=sentence.split(" ");
		 for(String word:words) {
			 if(word.length()>=len) {
			   if(searchWord.equals(word.substring(0,len)))
				   return i+1;
			 }
			 i++;
		 }
		 return ans;
	    }
	
}
