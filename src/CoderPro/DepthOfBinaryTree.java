package CoderPro;

public class DepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Tree root=new Tree(1);
     root.left=new Tree(1);
     root.left.left=new Tree(1);
     root.left.left.left=new Tree(1);
     root.right=new Tree(1);
     System.out.println("Answer: "+depth(root));
	}

	
	
	static int depth(Tree node) {
		if(node==null)
			return 0;
		return Math.max(depth(node.left),depth(node.right))+1;
	}
}



class Tree{
	int val;
	Tree left;
	Tree right;
	Tree(int val){
		this.val=val;
	}
}
