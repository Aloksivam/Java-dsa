package CoreJava.LinkedList;

public class LinL {
	private class Node{
		private int value;
		
		private Node next;
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
			
		}
	}
	
	private Node head,tail;
	private int size;
	public LinL() {
		this.size = 0;
	}
	public void InsertFirst(int value){
		Node nd = new Node(value);
		nd.next = head;
		head = nd;
		if(tail==null){
			tail = head;
		}
		size++;
	}
	public void display(){
		Node st = head;
		while(st!=null){
			System.out.print(st.value);
			System.out.print("-->");
			st = st.next;
		}
	}
	
}
