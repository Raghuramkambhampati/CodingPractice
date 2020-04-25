package LeetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] strs=new String [] {"a","abc","abcd","abcde"};
	   System.out.println("Answer: "+Prefix(strs));
	}

	public static String Prefix(String[] strs) {
		int len=strs.length;
		if(len==0)
			return "";
		
		String ans=new String(strs[0]);
		String tmp=new String();
		//i=0,1,2,.....1000...n
		for(int i=1;i<strs.length;i++) {
			tmp=strs[i];
			int j=Math.min(ans.length(),tmp.length());
			while(!ans.substring(0, j).equals(tmp.substring(0, j)))
				j--;
			ans=ans.substring(0, j);
		}
		
		
		return ans;
	}
}
