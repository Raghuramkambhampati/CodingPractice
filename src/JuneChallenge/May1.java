package JuneChallenge;

public class May1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		root.right=new TreeNode(7);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(9);
		invertTree(root);
		
	}
public static  TreeNode invertTree(TreeNode root) {
	invert(root);
	System.out.println("--------");
	return root;
    }

  public static void invert(TreeNode parent) {
	  TreeNode tmp;
	  if(parent.left==null && parent.right==null)
		  return;
	  else
	  {
		  tmp=parent.left;
		  parent.left=parent.right;
		  parent.right=tmp;
	  }
	  invert(parent.left);
	  invert(parent.right);
	  
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