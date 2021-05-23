package leetcode199;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="codeleet";
    int[] indices=new int[]{4,5,6,7,0,2,1,3};
    System.out.println("Answer: "+restoreString(s,indices));
	}
	public static String restoreString(String s, int[] indices) {
        StringBuffer ans=new StringBuffer();
        int[] ansind=new int[indices.length];
        for(int i=0;i<indices.length;i++) 
        	ansind[indices[i]]=i;
        for(int i=0;i<indices.length;i++) 
        	ans.append(s.charAt(ansind[i]));
        return ans.toString();
    }
}
