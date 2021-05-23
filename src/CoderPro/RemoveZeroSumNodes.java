package CoderPro;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;

public class RemoveZeroSumNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(2,new ListNode(1,new ListNode(-1,new ListNode(0,new ListNode(-1,new ListNode(7,null))))));
		head=removeZeroWindows(head);
		while(head!=null)
		{
			System.out.print("->"+head.val);
			head=head.next;
		}
	}

	
	
	/*
	 * Approach: Construct a new Array List which store the cumulative sum of the List nodes.
	 * if the cum sum appears again that implies the the sum is zero from for that window.
	 * Time complexity: n*n*n
	 * Space Complexity: O(N)
	 */
	
	public static ListNode removeZeroWindows1(ListNode head) {
		
		ArrayList<ListNode> cumsumList=new ArrayList<ListNode>();
		ListNode tmp=head;
		int cumsum=0;
		boolean found=false;
		while(tmp!=null) {
			cumsum+=tmp.val;
			found=false;
			for(int i=0;i<cumsumList.size();i++) {
				ListNode curNode=cumsumList.get(i);
				if(found)
					cumsumList.remove(i);
				else if(cumsum==curNode.val)
				{
					curNode.next.next=tmp.next;
					found=true;
				}
			}
	      	if(!found)cumsumList.add(new ListNode(cumsum,tmp));
			tmp=tmp.next;
		}
		return head;
	}
	
	
	
	
	/**
	 * Approach: Using Linked Hash Map
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 */
	public static ListNode removeZeroWindows(ListNode head) {
		ListNode tmp=new ListNode(0,head);
		head=tmp;
		int cumsum=0;
		LinkedHashMap<Integer,ListNode> sumToNode=new LinkedHashMap<Integer,ListNode>();
		Stack<Integer> stk=new Stack<Integer>();
		while(tmp!=null) {  // will run n times
			cumsum+=tmp.val;  //t1
			if(sumToNode.containsKey(cumsum)) { 
				//pop of all the elements till the cumsum
				sumToNode.get(cumsum).next=tmp.next;
				while(stk.peek()!=cumsum)  
					sumToNode.remove(stk.pop()); // will be ran n time most
			}
			else {
				sumToNode.put(cumsum,tmp);// will be ran n time at most
				stk.push(cumsum); // will be ran n times most.
			}
			tmp=tmp.next;
		}
		return head.next;
	}
	
}


class ListNode{
	int val;
	ListNode next=null;
	
	ListNode(){
	}
	ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	}
}