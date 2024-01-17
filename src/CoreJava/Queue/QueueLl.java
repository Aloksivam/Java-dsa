package CoreJava.Queue;

public class QueueLl {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class Queue{
		static Node head = null;
		static Node tail = null;
	public static boolean isEmpty(){
		return head==null && tail==null;
	}
	public static int remove(){
//		return head==null && tail==null;
		if(isEmpty()){
			System.out.println("No elements to remove");
		}
		int data = head.data;
		if(head==tail){
			tail=head=null;
		}
		else
		head = head.next;
		return data;
	}
	
	public static void add(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=tail=newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	public static int peek(){
		if(isEmpty()){
			System.out.println("No elements to display");
			return -1;
		}
		return head.data;
		
	}
	}
	
	public static void main(String[] args) {
		System.out.println("Let us implement queue using linked list");
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	}
}
