package CoderPro;

public class RemoveKElementfromLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LNode myList=new LNode(1,new LNode(2,new LNode(3,new LNode(4,new LNode(5,null)))));
       LNode tmp=myList;
       while(myList!=null) {
    	   System.out.print("->"+myList.val);
    	   myList=myList.next;
       }
       myList =removeElement(tmp,3);
       System.out.println();
       while(myList!=null) {
    	   System.out.print("->"+myList.val);
    	   myList=myList.next;
       }
	}

	
	/**
	 * Remove kth Element from the end of the linked list
	 * Approach: Iterate through the Linked List and get the length and again iterate through list and remove the element.
	 * Time Complexity: O(2N)
	 * SPace Complexity: O(N)
	 */
	public static LNode removeElement1(LNode myList, int index) {
		int len=0;
		LNode cur=myList;
		LNode Head=myList;
		//O(N)
		while(myList!=null) {
			len++;
			myList=myList.next;
		}
		
		LNode prev=null;
		index=len-index+1;len=1;
		//O(K)
		while(len!=index)
		{
			prev=cur;
			cur=cur.next;
			len++;
		}
		if(prev==null)
			return cur.next;
		else
			prev.next=cur.next;
		
		
		return Head;
	}


/*
 * 
 * Removing Kth element from the Linked List
 * Approach: Using 2 pointer Concept
 * TimeCoplexity: O(N).
 * Space Complexity: O(1)
 */
public static LNode removeElement(LNode myList, int index) {
	int len=1;
	LNode cur=myList;
	LNode Head=myList;
	LNode prev=null;
	while(len!=index)
	{
		prev=cur;
		cur=cur.next;
		len++;
	}
	
	if(prev==null)
		return cur.next;
	else
		prev.next=cur.next;
	
	
	return Head;
}
}



/*
 * Linked List
 * 
 */

class LNode
{
	int val;
	LNode next;
	
	public LNode(int val, LNode next) {
		this.val=val;
		this.next=next;
	}
}