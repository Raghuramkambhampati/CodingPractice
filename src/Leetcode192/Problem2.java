package Leetcode192;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[] {1,1,3,5,5};
        getStrongest(arr,2);
	}

	
public static int[] getStrongest(int[] arr, int k) {
        int[] ans=new int[k];
        int med,len=arr.length;
        ArrayList<Element> arrd=new ArrayList<Element>();
        Arrays.sort(arr);
        med=arr[(len-1)/2];
        for(int i=0;i<len;i++)
        	arrd.add(new Element(arr[i],Math.abs(med-arr[i])));
        
        for(int i=0;i<k;i++) {
        	Element e2=arrd.get(i);
        	for(int j=i+1;j<len;j++)
        	{
        		Element e1=arrd.get(j);
        		//Element tmp;
        		if(e1.meddif>e2.meddif)
        		{
        			arrd.add(i, e1);
        			arrd.remove(i+1);
        			arrd.add(j, e2);
        			arrd.remove(j+1);
        		}
        		if((e1.meddif==e2.meddif) && (e1.value>e2.value)) {
        			arrd.add(i, e1);
        			arrd.remove(i+1);
        			arrd.add(j, e2);
        			arrd.remove(j+1);
        		}
        	}
        	ans[i]=arrd.get(i).value;
        }
        
        
        
        return ans;
    }
}


class Element{
	int value;
	int meddif;
	Element(int value,int meddif){
		this.value=value;
		this.meddif=meddif;
	}
	
	/*
	 * class compareElemet implements Comparator<Element> { // Used for sorting in
	 * ascending order of // roll number public int compare(Element a, Element b) {
	 * return a.value - b.value; } }
	 */
}
