package CoreJava.Queue;//For collection framework all operations are O(1)
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueCf {
	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<>();	//Queue is an interface in java and we can't create object of an interfac and there are two classes implementing queue interface those are linkedlist and ArrayDeque
		Queue<Integer> q = new ArrayDeque<>();	//Queue is an interface in java and we can't create object of an interfac and there are two classes implementing queue interface those are linkedlist and ArrayDeque
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()){
			System.out.println(q.peek());
			q.remove();
		}
	}
}
