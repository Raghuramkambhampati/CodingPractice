package MayChallange;

import java.util.ArrayList;
import java.util.LinkedList;

public class May23 {

	 static int i=0,j=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A=new int[][]{{0,2},{5,10},{13,23},{24,25}};
		int[][] B=new int[][] {{1,5},{8,12},{15,24},{25,26}};
		intervalIntersection(A,B);
	}

	
	 public static  int[][] intervalIntersection(int[][] A, int[][] B) {
		 
		 int[][] ans=new int[][] {};
		 int l=0;
		 int[] tmp;
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 int min=Math.min(A[0][0], B[0][0]);
		 int max=Math.max(A[A.length-1][1], B[B.length-1][1]);
		 for(int k=min;k<=max;k++) {
			 tmp=new int[2];
			 while(!(contains(k,A,i) && contains(k,B,j)))
				 k++;
			tmp[0]=k;
			while(contains(k,A,i) && contains(k,B,j))
				 k++;
			tmp[1]=k-1;
			//ans[l++]=tmp;
			arr.add(tmp[0]);
			arr.add(tmp[1]);
			
		 }
		 
		 return ans;
	 }
	 
	 
	static  boolean contains(int n,int[][] Mat,int pointer) {
		 int[] tmp=Mat[pointer];
		 int min=tmp[0];
		 int max=tmp[1];
		 if(n>max) {
			 pointer++;
			 return contains(n,Mat,pointer);
		 }
		 else if(min<=n && n<=max)
			 return true;
		 return false;
	 }
	 
	/*
	 * static boolean containsB(int n) {
	 * 
	 * 
	 * return true; }
	 */
}
