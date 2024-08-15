package CoreJava.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackAndQueueUsingDeque {
	static class  Stackk {
			private static Deque<Integer> dq = new LinkedList<>();
		public static void push(int data){
			dq.addLast(data);
		}
		public static int pop(){
			if(dq.isEmpty()){
				System.out.println("empty stack");
				return -1;
			}
			return dq.removeLast();
		}
		public static int top(){
			if(dq.isEmpty()){
				System.out.println("empty stack");
				return -1;
			}
			return dq.getLast();
		}
		public static Boolean isEmpty(){
			return dq.isEmpty();
		}
		static class Queue{
			private static Deque<Integer> dq = new LinkedList<>();
			public static boolean isEmpty(){
				return dq.isEmpty();
			}
			public static void add(int data){
				dq.addLast(data);
			}
			public static int remove(){
				if(dq.isEmpty()){
					System.out.println("empty Queue");
					return -1;
				}
				return dq.removeFirst();
			}
			public static int peek(){
				if(dq.isEmpty()){
					System.out.println("empty Queue");
					return -1;
				}
				return dq.getFirst();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us implement Stack and Queue using Deque");
		Stackk st = new Stackk();
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		st.push(16);
		System.out.println(st);
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
}
