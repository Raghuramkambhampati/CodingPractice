package Leetcode212;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public static int minimumEffortPath(int[][] heights) {
	        int ans=Integer.MAX_VALUE;
	        traverse(heights,0,0,0,ans);
	        return ans;
	    }
	
	 
	 public static void traverse(int[][] heights,int i,int j,int effort,int minaffort) {
		 int tmp;
		 if(i==heights.length && j==heights[0].length)
		 {
			 minaffort=Math.min(effort, minaffort);
			 return;
		 }
			 
		 
		 
		 if(i+1<heights.length) {
			 effort=Math.max(effort, heights[i+1][j]-heights[i][j]);
			 traverse(heights,i+1,j,effort,minaffort);
		 }
		 if(j+1<heights[0].length) {
			 effort=Math.max(effort,heights[i][j+1]-heights[i][j]);
			 traverse(heights,i,j+1,effort,minaffort);
		 }
		 if(i-1>0) {
			 effort=Math.max(effort,heights[i-1][j]-heights[i][j]);
			 traverse(heights,i-1,j,effort,minaffort);
		 }
		 if(j-1>0) {
			 effort=Math.max(effort,heights[i][j-1]-heights[i][j]);
			 traverse(heights,i,j-1,effort,minaffort);
		 }
	 }
	
}
