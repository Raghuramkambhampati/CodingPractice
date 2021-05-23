package leetcode199;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("anseer: "+minFlips("001011101"));
	}

	public static int minFlips(String target) {
        int ans=0;
        char prev='0';
        for(char curr:target.toCharArray())
        {
        	if(curr!=prev)
        	{
        		ans++;
        		prev=curr;
        	}
        	
        }
        
        return ans;
    }
	

}
