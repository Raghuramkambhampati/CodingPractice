package LeetCode209;

import java.util.HashMap;
import java.util.LinkedList;

public class Problem2 {
   
	
	public static  HashMap<Integer,LinkedList<Integer>> myTreeMap=new HashMap<Integer,LinkedList<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public static boolean isEvenOddTree(TreeNode root) {
        DFS(root,0);
        int levels=myTreeMap.size();
        for(int i=0;i<levels;i++) {
        	boolean even=i%2==0?true:false;
        	LinkedList<Integer> levelList=myTreeMap.get(i);
        	int prev=0,next=Integer.MAX_VALUE,curr;
        	if(even) {
        		//should have odd integers and in increasing order
        		for(int j=0;j<levelList.size();i++) {
        			curr=levelList.get(j);
        			if(curr%2==0 || curr<prev )
        				return false;
        			prev=curr;
             	}
        	}
        	else {
        		//should have odd integers and in increasing order
        		for(int j=0;j<levelList.size();i++) {
        			curr=levelList.get(j);
        			if(curr%2!=0 || curr>prev )
        				return false;
        			prev=curr;
             	}
        	}
        	
        }
        return true;
    }

public static void DFS(TreeNode node,int level)
{
	
	if(node==null)
		return ;
	LinkedList<Integer> levelList=myTreeMap.getOrDefault(level, new LinkedList<Integer>());
	levelList.add(node.val);
	myTreeMap.put(level, levelList);
	if(node.left!=null) DFS(node,level+1);
	if(node.right!=null) DFS(node,level+1);	
}

}




 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
 }