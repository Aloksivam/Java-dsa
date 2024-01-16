package CoreJava.LinkedList;
public class LinkedListexample {

public static class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public  void add(int index,int data){
		int counter = 0;
		if(index==0){
			addFirst(data);
			return;
		}
		Node temp = head;
		while(counter+1!=index){
			temp = temp.next;
			counter++;
		}
		Node alt = new Node(data);
		alt.next = temp.next;
		temp.next=alt;
		size++;
	}
	public void addFirst(int data){
		size++;
		Node newNOde = new Node(data);
		if(head==null){
			head=newNOde;
			tail=newNOde;
			return;
		}
		newNOde.next = head;
		head = newNOde;
	}
	public void addlast(int data){
		size++;
		Node newNOde = new Node(data);
		if(tail==null){
			addFirst(data);
		}
		tail.next = newNOde;
		tail = newNOde;
		size++;
	}
	public  int removeFirst(){
		if(head==null){
			System.out.println("can't remove any element");
			return Integer.MIN_VALUE;
		}
		int data = head.data;
		head = head.next;
//		Node newNOde = new Node(data);
		return data;
	}
	public  int removelast(){
		if(tail==null){
			System.out.println("can't remove any element");
			return Integer.MIN_VALUE;
		}
		Node temp = head;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		int data = tail.data;
		temp.next=null;
		tail = temp;
		size--;
		return data;
	}
	public  void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		
		System.out.print("Null");
	}	public  void display(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ->");
			temp = temp.next;
		}
		
		System.out.print("Null");
	}
	public int Search(int index,int target,Node curr){
		if(curr.data==target){
			return index;
		}
		if(curr.next==null){
			return -1;
		}
		return Search(index+1,target,curr.next);
	}
	public void RevList(){
		Node prev = null;
		Node curr = tail=head;
		Node next;
//		curr.next = prev;
		while(curr!=null){
			next = curr.next;
			curr.next=prev;
			prev =curr;
			curr = next;
		}
		head=prev;
	}
	public int helper(Node head,int key){
		if(head==null){
			return -1;
		}
		if(head.data==key){
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx==-1){
			return -1;
		}
		return idx+1;
	}
	public int recSearch(int key){
		return helper(head,key);
	}
	//Find and remove nth end from node
//	public int findAndRem(int n){
//		Node temp = tail;
//
//	}
	public Node swap(Node head,int k){
		Node temp = head;
		int size=0;
		while(temp!=null)
		{
			temp=temp.next;
			size++;
		}
		int stI1 = k,stI2 = size-k+1;
		int i=1;
//		if(k==size){
//			int tempv = head.val
//			head.val = temp.val;
//			temp.val = tempv;
//			return head;
//		}
		Node curr = head;
		while(i<=stI1){
			curr = curr.next;
		}
		Node node1 = temp;
		i=1;
		temp = head;
		while(i!=stI2){
			temp = temp.next;
		}
//		Node node2 = temp;
//		int tempv = node1.val;
//		node1.val = node2.val;
//		node2.val = tempv;
		return head;
	}
	public Node FindMid(Node head){
		Node slow,fast;
		slow = head;
		fast = head;
		while(fast!=null &&fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public boolean isPallindrom(Node head){
		if(head==null||head.next==null){
			return true;
		}
		boolean isPallin = true;
		
		Node mid = FindMid(head);
//		RevList(mid);
		Node prev = null;
		Node curr = mid;
		Node next;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node left = head;
		Node right = prev;
		System.out.println();
		display(head);
		System.out.println();
		display(prev);
//		while(left!=right){
		while(right!=null){
			if(left.data!=right.data){
				isPallin = false;
				return isPallin;
			}
			left = left.next;
			right = right.next;
		}
		return isPallin;
	}
	public Node RevList(Node head){
		Node prev = null;
		Node curr = head;
		tail = head;
		Node next;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public int function1(){
		System.out.println(" i am present in function 1");
		return 33;
	}
	public void func2(){
		LinkedListexample llc = new LinkedListexample();
		System.out.println(llc.function1());
		
	}
	public boolean isCyclic(Node head){
//		boolean isCycle = false;
		Node slow  = head;
		Node fast  = head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast){
				return true;
			}
		
		}	return false;
	}
	public void RemoveCycle(Node head){
		boolean CycleFound = false;
		Node slow  = head;
		Node fast  = head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast && !(CycleFound)){
				CycleFound = true;
				break;
//				return true;
			}
			
		}
		if(CycleFound){
			Node prev =null;
			slow = head;
			while(fast!=slow){
				prev = fast;
				fast = fast.next;
				slow = slow.next;
			}
			prev.next = null;
		}
	}
	private Node getMid(Node head){
		Node slow = head;
		Node fast = head.next;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public Node MergeLinkedList(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node mid = getMid(head);
		Node rightHead = mid.next;
		mid.next= null;
		Node leftHead = head;
		Node newLeft = MergeLinkedList(leftHead);
		Node newRight = MergeLinkedList(rightHead);
		return merge(newLeft,newRight);
	}
	private Node merge(Node head1,Node head2){
		Node mergedL = new Node(-1);
		Node temp = mergedL;
		while(head1!=null && head2!=null){
			if(head1.data<=head2.data){
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			}
			else{
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
			
		}
		while(head1!=null){
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		while (head2!=null){
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		return mergedL.next;
	}
	public void Zigjag(Node head){
		Node mid = getMid(head);
		//reverse the 2nd half
		Node rthead = mid.next;
		mid.next = null;
		Node prev = null;
		Node curr = rthead;
		tail = rthead;
		Node next;
		while (curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr  = next;
		}
		rthead = prev;
		Node lthead = head;
		Node ltnext,rtnext;
		while (lthead!=null && rthead!=null){
			ltnext = lthead.next;
			lthead.next = rthead;
			rtnext = rthead.next;
			rthead.next = ltnext;
			lthead=ltnext;
			rthead = rtnext;
		}
	}
	public static void main(String[] args) {
		System.out.println("let us start linked list");
		LinkedListexample ll = new LinkedListexample();
		ll.addFirst(12);
		ll.addFirst(13);
		ll.addFirst(14);
		ll.addlast(44);
		ll.add(2,57);
		ll.display(head);
//		ll.head = ll.MergeLinkedList(head);
		ll.Zigjag(head);
		ll.display(head);
		
//		ll.removelast();
//		ll.removeFirst();
//		ll.display();
//		System.out.println();
//		System.out.println(ll.Search(0,57,head));
//		System.out.println(ll.Search(0,14,head));
//		System.out.println(ll.Search(0,44,head));
//		ll.RevList();
//		ll.display();
//		Node res = ll.FindMid(head);
//		ll.addlast(40);
//		System.out.println(res.data);
//		ll.display();
//		Node res2 = ll.FindMid(head);
//		System.out.println(res2.data);
//		ll.func2();
//		int n1,n2;
//		n1=n2=66;
//		LinkedListexample ll3 = new LinkedListexample();
//		ll3.add(0,23);
//		ll3.add(1,13);
//		ll3.add(2,45);
//		ll3.add(3,89);
//		ll3.add(4,89);
//		ll3.add(5,45);
//		ll3.add(6,13);
//		ll3.add(7,23);
//		ll3.display();
//		System.out.println(ll3.isPallindrom(head));
		LinkedListexample ll4 = new LinkedListexample();
//		Node head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		head.next.next.next = head;
		//Let us make a real linked list containing cycle
//		 head = new Node(1);
//		Node temp = new Node(2);
//		head.next = temp;
//		head.next.next = new Node(3);
//		head.next.next.next = temp;
//		System.out.println(ll4.isCyclic(head));
//		ll4.RemoveCycle(head);
//		System.out.println(ll4.isCyclic(head));
//		ll4.display(head);
		
//		System.out.println("n1="+ n1+" n2="+n2);
	}
	public void removefromLat(int n)
	{
		Node temp = head;
		int size=0;
		while(temp!=null){
			temp = temp.next;
			size++;
		}
		if(n==size){
			head = head.next;
		}
		temp = head;
		int counter=1;
		int indfst = size-n;
		while(counter!=indfst){
			temp = temp.next;
			counter++;
		}
		temp.next = temp.next.next;
	}
}
