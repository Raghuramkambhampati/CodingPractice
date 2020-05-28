package LeetCode190;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public static int pseudoPalindromicPaths (TreeNode root) {
    int ans=0;   
	
	return ans;
    }

  public static int traverseDeep(TreeNode t,ArrayList<Integer> nums,int count) {
	  
	  if(nums.contains(t.val))
		  nums.remove(t.val);
	  else 
		  nums.add(t.val);
	  
	  if(t.left==null || t.right==null)
	  {
		  if(nums.size()==1)
			  return 1;
		  else
			  return 0;
	  }
	  
	 
	  if(t.left!=null)
	  count+=traverseDeep(t.left,nums,count);
	  if(t.right!=null)
	  count+=traverseDeep(t.right,nums,count);
	  return count;
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