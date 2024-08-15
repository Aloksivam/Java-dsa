package CoreJava.Stack;

public class StackLL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class Stack{
		static Node head=null;
		public static boolean isEmpty(){
			return (head==null);
		}
		public static void push(int data){
			Node newNode = new Node(data);
			if(isEmpty()){
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		public static int pop(){
			if(isEmpty()){
				return -1;
			}
			int data = head.data;
			head = head.next;
			return data;
		}
		public static int peek(){
			if(isEmpty()){
				return -1;
			}
			return head.data;
		}
		//we will try to do it through recursion without using any extra memory spcae in linear time
		public static void pushBottom(int data){
		
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Let us implement stack by linked list");
		StackB.Stack s = new StackB.Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
}
