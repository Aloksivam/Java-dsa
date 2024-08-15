package Algorithms.HeapDS;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueues {
static class Student implements Comparable<Student >{
	String name;
	int rank;
	
	public Student(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.rank - o.rank;
	}
}
	public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//If we want to give a higher number as more priority
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//		PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Student> pq = new PriorityQueue<>();
//		pq.add(1);
//		pq.add(4);
//		pq.add(6);
//		pq.add(-6);
//		while (!pq.isEmpty()){
//			System.out.println(pq.peek());
//			pq.remove();
//		}
		pq.add(new Student("aman",14));
		pq.add(new Student("alok",13));
		pq.add(new Student("ananya",18));
		pq.add(new Student("adya",24));
		while (!pq.isEmpty()){
			System.out.println(pq.peek().name+"->"+pq.peek().rank);
			pq.remove();
		}
	}
}
