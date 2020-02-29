package leetcodepratcie;

public class AllSubStrings {

	public static void main(String[] args) {
		
		String s1=new String("abcdef");
		int n=s1.length();
		
		System.out.println("Below are all the possible substrings available for"+s1);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.println("Substring:"+s1.substring(i,j));
			}
		}
		
		

	}

}
