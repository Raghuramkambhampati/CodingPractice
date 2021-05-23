package LeetCode179;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String problem1(int n) {
		
		String s1="a";
        String s2="b";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n-1;i++)
			ans.append(s1);
		if(n%2!=0)
			ans.append(s1);
		else
			ans.append(s2);
		
		return ans.toString();
	}
}
