package CoreJava.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void Reverse(Queue<Integer> q){
		Stack<Integer> s = new Stack<>();
		while(!q.isEmpty()){
			s.push(q.remove());
		}
		while(!s.isEmpty()){
			q.add(s.pop());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Let us reverse the given queue");
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.add(10);
		Reverse(q);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	}
}
