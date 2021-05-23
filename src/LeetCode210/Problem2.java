package LeetCode210;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] roads=new int[6][6];
		roads[0][0]=0;roads[0][1]=1;
		roads[1][0]=0;roads[1][1]=3;
		roads[2][0]=1;roads[2][1]=2;
		roads[3][0]=1;roads[3][1]=3;
		roads[4][0]=2;roads[4][1]=3;
		roads[5][0]=2;roads[5][1]=4;
		int n=5;
		System.out.println("Answer: "+maximalNetworkRank(n,roads));
	}

	
	
	 public static int maximalNetworkRank(int n, int[][] roads) {
	        int ans=0;
	        int[] adgecount=new int[n];
	        int curnetrank;
	        boolean[][] mat=new boolean[n][n];
	        for(int[] road:roads) {
	        	int a=road[0];
	        	int b=road[1];
	        	adgecount[a]++;
	        	adgecount[b]++;
	        	mat[a][b]=true;
	        	mat[b][a]=true;
	        }
	        
	        for(int i=0;i<n;i++) 
	        	for(int j=i+1;j<n;j++) {
	        		curnetrank=adgecount[i]+adgecount[j];
	        		if(mat[i][j])
	        			curnetrank--;
	        		ans=Math.max(ans, curnetrank);
	        }
	        return ans;
	    }
}
