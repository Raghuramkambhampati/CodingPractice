package CoderPro;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1=new ListNode(1,new ListNode(5,new ListNode(8,new ListNode(10,new ListNode(13,new ListNode(17,null))))));
		ListNode l2=new ListNode(0,new ListNode(6,new ListNode(9,new ListNode(14,new ListNode(21,new ListNode(77,null))))));
		ListNode l3=mergeLinkedList(l1,l2);
		while(l3!=null)
		{
			System.out.print("->"+l3.val);
			l3=l3.next;
		}
		
		
	}

	
	/*
	 * Approach: Copy the linked lists in to an array list and sort them using any sort and then copy the elements in to a linked list.
	 * Time complexity: (n+m)*(Time taken for single copy operation)+(n+m)log(n+m)(Time taken for comparison operation). O((n+m)log(n+m))
	 * Space Complexity: Array List of size n and linked list of size n . O(2n)
	 */
	
	public static ListNode mergeLinkedList1(ListNode l1,ListNode l2) {
		ListNode ans=new ListNode();
		ListNode head=ans;
		ArrayList<Integer> nums=new ArrayList<Integer>();
		while(l1!=null) {
			nums.add(l1.val);
			l1=l1.next;
		}
		while(l2!=null) {
			nums.add(l2.val);
			l2=l2.next;
		}
		Collections.sort(nums);
		
		for(Integer num:nums) {
			ans.next=new ListNode(num,null);
			ans=ans.next;
		}
		return head.next;
	}
	
	/**
	 * Approach: Compare the elements of the linked lists and merge them like merge sort.
	 * Time Complexity: O(n+m).
	 * Space Complexity: O(1).
	 */
	
	public static ListNode mergeLinkedList(ListNode l1,ListNode l2) {
		ListNode head=new ListNode();
		ListNode tmp=head;
		while(l1!=null && l2!=null) {
			if(l1.val<=l2.val) {tmp.next=l1;tmp=l1;l1=l1.next;}
			else {tmp.next=l2;tmp=l2;l2=l2.next;}
		}
		if(l1==null) tmp.next=l2;
		else if(l2==null) tmp.next=l1;
		return head.next;
	}
	
}
