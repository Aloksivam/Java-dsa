package CoreJava.Queue;


import java.util.*;

public class DequeExample {
	public static void main(String[] args) {
		System.out.println("Let us learn Deque" +
				"Note that deque and dequeue are not same first refers to double ended queue and second one is a verb that is operation of removing an element from the queue");
		Deque<Integer> dq = new LinkedList<>();
		Collections.addAll(dq,11,12,13,14);
		dq.addFirst(11);
		dq.addLast(45);
		System.out.println(dq);
//		while (!dq.isEmpty()){
//			System.out.print(dq.remove()+"  ");
//		}
		System.out.println("Adding multiple elements at a time to a linkedlist");
		LinkedList<Integer> q = new LinkedList<>();
		Collections.addAll(q,11,12,13,14);
		System.out.println(q);
//		while(!q.isEmpty()){
//			System.out.print(q.remove()+"  ");
//		}
		//same thing, we can do with normal queue
//		q.addAll()
		System.out.println("yes, it is applicable to all");
	    Stack<Integer> s = new Stack<>();
		Collections.addAll(s,12,34,56);
		System.out.println(s);
//		while(!s.isEmpty()){
//			System.out.print(s.pop()+" ");
//		}
	}
}
