package CoreJava.LinkedList;

public class DoublyLL {
	public class Node{
		int data;
		Node next,prev;
		public Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	//add
	public void addFirst(int data){
		size++;
		Node temp = new Node(data);
		if(head==null){
			head = temp;
			tail = temp;
			return;
		}
		temp.next  = head;
		head.prev = temp;
		head = temp;
	}
	public void addLast(int data){
		size++;
		Node temp = new Node(data);
		if(head==null){
			head = temp;
			tail = temp;
			return;
		}
		Node curr = head;
		while (curr.next!=null){
			curr=curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		temp.next = null;
	}
	
	public int removeFirst(){
		if(head==null){
			return -1;
		}
		if(size==1){
			int data = head.data;
			head=tail=null;
		}
		int data = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return data;
	}
	public int removeLast(){
		if(head==null){
			return -1;
		}
		if(head.next==null){
			 return removeFirst();
		}
		Node temp = head;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		int data = temp.next.data;
		temp.next = null;
		tail = temp;
		return data;
	}
	
	public void print(){
		if(head==null){
			System.out.println("No nodes to display");
			return;
		}
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public void RevDll(){
		Node curr=tail=head;
		Node prev = null;
		Node next;
		while (curr!=null){
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public static void main(String[] args) {
		System.out.println("let us understand doubly linked list");
		DoublyLL dll = new DoublyLL();
		dll.addFirst(1);
		dll.addFirst(2);
		dll.addFirst(3);
		dll.addFirst(4);
		dll.addFirst(5);
		dll.print();
		dll.removeFirst();
		dll.print();
		dll.removeLast();
		dll.print();
		dll.addLast(12);
		dll.addLast(34);
		dll.print();
		dll.RevDll();
		dll.print();
	}
}
