package CoreJava.Queue;

import java.util.Stack;

public class QueueUsing2Stacks {
	static class Queue{
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		public static boolean isEmpty(){
			return s1.isEmpty();
		}
		
		public static void add(int data){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
		}
		public static int remove(){
			if(isEmpty()){
				System.out.println("Queue empty");
				return -1;
			}
			return s1.pop();
		}
		public static int peek(){
			if(isEmpty()){
				System.out.println("Queuee empty");
				return -1;
			}
			return s1.peek();
		}
	}
	static class Queue2{
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		public static boolean isEmpty(){
			return s1.isEmpty();
		}
		
		public static void add(int data){
			s1.push(data);
		}
		public static int remove(){
			if(isEmpty()){
				System.out.println("Queue empty");
				return -1;
			}
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			return s2.pop();
		}
		public static int peek(){
			if(isEmpty()){
				System.out.println("Queuee empty");
				return -1;
			}
			return s2.peek();
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us implement queue using 2 stacks");
		Queue2 q = new Queue2();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	}
}
