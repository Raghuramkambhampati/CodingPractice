package CoderPro;

public class AddLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LListNode n1=new LListNode(2);
		n1.next=new LListNode(4);
		n1.next.next=new LListNode(3);
		LListNode n2=new LListNode(5);
		n2.next=new LListNode(6);
		n2.next.next=new LListNode(4);
		LListNode ans=addLinkedList(n1,n2);
		
		while(ans.next!=null)
		{
			System.out.print(ans.val+"->");
			ans=ans.next;
		}
		System.out.print(ans.val);
	}

	public static LListNode  addLinkedList(LListNode n1,LListNode n2) {
		
		if(n1==null)
			return n2;
		if(n2==null)
			return n1;
		
		int c=0,val,x,y;
		LListNode ans=new LListNode(0);
		LListNode tmp=ans;
		while(n1!=null || n2!=null) {
			x= n1==null? 0 : n1.val;
			y= n2==null? 0 : n2.val;
			val=x+y+c;
			c=val/10;
			ans.next=new LListNode(val%10);
			n1=n1==null? null:n1.next;
			n2=n2==null? null:n2.next;
			ans=ans.next;
		}
		if(c>0)
			ans.next=new LListNode(c);
		return tmp.next;
	}
	
	
}







class LListNode{
	int val;
	LListNode next=null;
	
	LListNode(){
	}
	LListNode(int val){
		this.val=val;
	}
}