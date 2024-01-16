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
	}
	public static void main(String[] args) {
		System.out.println("Let us implement queue using linked list");
		
	}
}
