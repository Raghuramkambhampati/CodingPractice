package LeetCode191;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] horizontalCuts=new int[] {37,40,41,30,27,10,31};
		int[] verticalCuts=new int[] {2,1,9,5,4,12,6,13,11};
       System.out.println("Answer: "+maxArea(50,15,horizontalCuts,verticalCuts));
	}

	
public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
	     Arrays.sort(horizontalCuts);
	     Arrays.sort(verticalCuts);
        int maxHeight=horizontalCuts[0],maxWidth=verticalCuts[0],tmp;
        int len=horizontalCuts.length;
	for(int i=1;i<len;i++)
		maxHeight=Math.max(maxHeight, horizontalCuts[i]-horizontalCuts[i-1]);
	maxHeight=Math.max(maxHeight, h- horizontalCuts[len-1]);
	len=verticalCuts.length;
   for(int i=1;i<len;i++) 
		maxWidth=Math.max(maxWidth,verticalCuts[i]-verticalCuts[i-1]);
   maxWidth=Math.max(maxWidth, w- verticalCuts[len-1]);
   tmp=(maxHeight*maxWidth)%((int)Math.pow(10, 9) + 7);
    return ((maxHeight*maxWidth));
    }
}
