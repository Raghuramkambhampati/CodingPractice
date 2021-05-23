package LeetCode;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid=new char[3][3];
		grid[0][0]='1';
		grid[0][1]='0';
		grid[0][2]='1';
		grid[1][0]='1';
		grid[1][1]='1';
		grid[1][2]='0';
		grid[2][0]='0';
		grid[2][1]='1';
		grid[2][2]='1';
          System.out.println("Answer: "+numIslands(grid));
	}

	
	 public static int numIslands(char[][] grid) {
	     int r=grid.length;
	     int c=grid[0].length;
	     int ans=0;
	     for(int i=0;i<r;i++)
	    	 for(int j=0;j<c;j++) {
	    		 if(grid[i][j]=='1')
	    		 {
	    			 ans++;
	    			 travelIsland(grid,r,c,i,j);
	    		 }
	    		 
	    	 }
		 return ans;
	    }
	 
	 public static void travelIsland(char[][] grid,int r,int c,int i,int j) {
		 grid[i][j]=0;
		if(i>0 && grid[i-1][j]=='1') travelIsland(grid,r,c,i-1,j);
		if(j<c-1 && grid[i][j+1]=='1') travelIsland(grid,r,c,i,j+1);
		if(i<r-1 && grid[i+1][j]=='1') travelIsland(grid,r,c,i+1,j);
		if(j>0 && grid[i][j-1]=='1') travelIsland(grid,r,c,i,j-1); 
	 }
	 
	 
}
