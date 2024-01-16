package CoreJava.Queue;

public class QueueArray {
	static class Queue{
		static int[] arr;
		static int size;
		static int rear;
		static int front;
		Queue(int n){
			arr = new int[n];
			size = n;
			rear = -1;
		}
		public static boolean isEmpty(){
			return (rear==-1);
		}
		public static void add(int data){
			if(rear==size-1){
				System.out.println("Queue is full");
				return;
			}
			rear = rear+1;
			arr[rear] = data;
			size++;
		}
		public static int remove(){
			if(front==-1){
				System.out.println("queue is empty");
				return -1;
			}
			int data = arr[0];
//			front+=1;
//			size--;
			for (int i = 0; i < arr.length-1; i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return data;
		}
		public static int peek(){
			
			return arr[0];
		}
		public static void display(){
			for (int i = 0; i <=rear; i++) {
				System.out.print(arr[i]+" ");
			}
				}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Let us implement queue by array in java");
		Queue q = new Queue(5);
		q.add(1);
		q.add(12);
		q.add(123);
		q.add(11);
		q.add(1222);
//		q.display();
		while (!q.isEmpty()){
			System.out.println((q.peek()));
			q.remove();
		}
	}
}
