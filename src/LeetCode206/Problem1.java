package LeetCode206;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
public static int numSpecial(int[][] mat) {
    int ans=0;    
	int row=mat.length;
    int col=row!=0?mat[0].length:0;
    int[] rowCount=new int[row];
    int[] colcount=new int[col];
        for(int i=0;i<row;i++)
        	for(int j=0;j<col;j++)
        	{
        		if(mat[i][j]==1)
        		{
        			rowCount[i]++;
        			colcount[j]++;
        		}
        	}
        
        
        
        for(int i=0;i<row;i++) {
        	if(rowCount[i]==1)
        	for(int j=0;j<col;j++)
        	{
        		if(mat[i][j]==1)
        		{
        			if(colcount[j]==1)
        			 ans++;
        			break;
        		}
        	}
        
        }
        
        
        return ans;
    }
}
