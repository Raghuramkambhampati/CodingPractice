package LeetCode219;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(" Answer: "+minPartitions("32"));
	}

	
public static int minPartitions(String n) {
        int ans=0,tmp;
        char[] number=n.toCharArray();
        for(char ch:number) {
        	tmp=Character.getNumericValue(ch);  
        	if(tmp>ans) {
        		if(tmp==9)
            		return 9;
        		ans=tmp;
        	}
        		 
        }
        return ans;
    }
}
