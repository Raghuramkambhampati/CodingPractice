package CoderPro;


/*
 * This is a binary search tree
 * In BST all the right node value is less than middle node and all the left node value is greater than middle node value.
 * in other words highest value in the right tree should be less than node value.
 * lowest value of the left sub tree should be greater than node value.
 * 
 */
public class BST {

	public static void main(String[] args) {
	
		node n1 = new node(5);
		n1.left = new node(4);
		n1.right = new node(7);
		System.out.println(isValidBST(n1));
	}

	
	public static boolean isValidBST(node n) {
		return helper(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public static boolean helper(node n,Integer lower,Integer upper) {
		if(n==null) 
			return true;
		Integer val=n.val;
		if(!(lower<val && val<upper))
			return false;
		if(!(helper(n.right,val,upper)))
			return false;
		if(!(helper(n.left,lower,val)))
			return false;
		return true;
	}
}


class node{
	Integer val;
	node left;
	node right;
	public node(int n) {
		val=n;
	}
}