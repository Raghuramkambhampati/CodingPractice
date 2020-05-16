package LeetCode188;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] target=new int[] {2,3,4};
         int n=4;
         List<String> ans=buildArray(target,n);
         for(String s:ans)
        	 System.out.println(s+" ");
	}

	 public static List<String> buildArray(int[] target, int n) {
		 
		 List<String> ans=new ArrayList();
		 int j=1;
		 for(int i=0;i<target.length;) {
			 if(target[i]==j) {
				 ans.add("Push");
				 i++;j++;
			 }
			 else {
				 ans.add("Push");
				 ans.add("Pop");
				 j++;
			 }
		 }
		 
		 return ans;
	 }
	
}
