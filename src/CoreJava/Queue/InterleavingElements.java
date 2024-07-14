package CoreJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleavingElements {
	public static void InterLeaving(Queue<Integer> q){
//		q = new LinkedList<>();
		int size= q.size();
//		Queue<Integer> q3 = q;
//		while(!q3.isEmpty()){
//			q3.remove();
//			size++;
//		}
		Queue<Integer> q2 = new LinkedList<>();
		int counter=0;
		while(counter<=size/2-1){
			q2.add(q.remove());
				counter++;
		}
//		for (int i = 0; i < size / 2; i++) { // do not use q.size()as it will keep decreasing
//			q2.add(q.remove());
//		}
		while(!q2.isEmpty()){
			q.add(q2.remove());
			q.add(q.remove());
		}
	}
	public static void main(String[] args) {
		System.out.println("Inteleaving of elements of given queue");
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
		InterLeaving(q);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	
	}
}
