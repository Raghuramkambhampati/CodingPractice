package LeetCode;

public class MergeLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //#21
		//1,2,3 && 4,5,6
		//100,300,500,700  && 10,11,34,46,50,900
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(300);
		l1.next.next=new ListNode(500);
		ListNode l2=new ListNode(10);
		l2.next=new ListNode(350);
		l2.next.next=new ListNode(600);
		ListNode l3=Merge(l1,l2);
		while(l3!=null) {
			System.out.print("->"+l3.val);
			l3=l3.next;
		}
		
	}
  
	
	/*
	 * Given two sorted linked lists l1,l2  of size n,m 
	 * 0<=n<=max and 0<=m<=max and sorted l1.next.val>=l1.val
	 */
	public static ListNode Merge(ListNode l1,ListNode l2) {
		
		if(l1==null || l2==null)
		   return l1==null?l2:l1;
		ListNode ans=new ListNode(0),tmp=ans;
		int val1,val2;
		while(l1!=null || l2!=null) {
			val1=l1!=null?l1.val:Integer.MAX_VALUE;
			val2=l2!=null?l2.val:Integer.MAX_VALUE;
			if(val1>val2) {
				tmp.next=new ListNode(val2);
				tmp=tmp.next;
				l2=l2.next;
			}
			else if(val1<val2){
				tmp.next=new ListNode(val1);
				tmp=tmp.next;
				l1=l1.next;
			}
			else {
				tmp.next=new ListNode(val1);
				tmp=tmp.next;
				tmp.next=new ListNode(val2);
				tmp=tmp.next;
				l1=l1.next;
				l2=l2.next;
			}
		}
		return ans.next;
	}
	
	
	
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		if(l1==null) return l2;
	    if(l2==null) return l1;

	    if(l1.val<=l2.val){
	        l1.next=mergeTwoLists(l1.next, l2);
	        return l1;
	    } else {
	        l2.next=mergeTwoLists(l1, l2.next);
	        return l2;
	}
}

}

 class ListNode {
 int val;
 ListNode next;
 ListNode(int x) { val = x; }
 }