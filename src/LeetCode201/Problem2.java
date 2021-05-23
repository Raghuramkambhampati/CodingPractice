package LeetCode201;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Anser: "+findKthBit(2,3));
	}

	
	
	 public static  char findKthBit(int n, int k) {
	        String ans=new String();
	        ans=getString(n);  
	        return ans.charAt(k-1);
	    }
	 
	 public static String getString(int n) {
		 if(n==0) return "0";
		 String prev=getString(n-1);
		 return prev+"1"+stringFun(prev);
	 }
	 
	 public static String stringFun(String s) {
		 int len=s.length();
		 StringBuffer sb=new StringBuffer();
		 for(int i=len-1;i>=0;i--)
		 {
			 if(s.charAt(i)=='0')
				 sb.append("1");
			 else
				 sb.append("0");
		 }
		 return sb.toString();
	 }
}
