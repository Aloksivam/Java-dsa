package CoreJava.LinkedList;
import java.util.LinkedList;

public class LLCollectioFw {
	public static void main(String[] args) {
		System.out.println("Let us use linkedlist which are available in collecion framework");
		//create, add remove
		LinkedList<Integer> ll = new LinkedList<>();
		//add
		ll.addLast(12);
		ll.addLast(23);
		ll.addFirst(33);
		System.out.println(ll);
		ll.removeLast();
		ll.removeFirst();
	}
}
