package JuneChallenge;

public class June9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" "+isSubsequence("","ahgbdc"));
	}
	 public static boolean isSubsequence(String s, String t) {
	      int l=s.length();
	      int m=t.length();
	      if(l==0||l>m)
	    	  return false;
		 for(int i=0,j=0;i<t.length();i++) {
			 if(t.charAt(i)==s.charAt(j))
				 j++;
			 if(j==l)
				 return true;
			 
		 }
		 return false;
	    }
}
