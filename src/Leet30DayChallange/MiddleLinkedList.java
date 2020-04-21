package Leet30DayChallange;

public class MiddleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Given an single linked list with n elements 
		//return the list from the middle of the linked list
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(3);
		l1.next.next.next=new ListNode(4);
		//l1.next.next.next.next=new ListNode(5);
		l1=Middle(l1);
		while(l1!=null) {
			System.out.println("->"+l1.val);
			l1=l1.next;
		}
	}

	
	
	public static ListNode Middle(ListNode l) {
		int len=0,i=0;
		ListNode tmp=l;
		while(tmp!=null) {
			len++;
			tmp=tmp.next;
		}
			len=len/2+1;
		tmp=l;
		while(tmp!=null) {
			i++;
			if(i==len)
				break;
			tmp=tmp.next;
		}
		
		return tmp;
	}
}


class ListNode {
	  int val;
	  ListNode next;
	 ListNode(int x) { val = x; }
}