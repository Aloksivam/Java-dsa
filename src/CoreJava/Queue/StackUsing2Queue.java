package CoreJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
	static class Stack{
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();
		public static boolean isEmpty(){
			return q1.isEmpty() && q2.isEmpty();
		}
		public static void add(int data){
			if(!q1.isEmpty()){
				q1.add(data);
			}
			else
			q2.add(data);
		}
		
		public static int pop(){
			if(isEmpty()){
				System.out.println("Empty Stack");
				return -1;
			}
			int top = -1;
			while(!q1.isEmpty()){
				q2.add(q1.remove());
			} 
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us implement Stacks using 2 Queue");
	}
}
