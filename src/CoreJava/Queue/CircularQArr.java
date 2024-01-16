package CoreJava.Queue;

public class CircularQArr {
	static class CircularQ{
//		 int data;
		static int size,rear,front;
		static int[] cirQ;
		CircularQ(int n){
			cirQ = new int[n];
			size = n;
			rear=front=-1;
		}
		public static boolean isEmpty(){
			return rear ==-1 && front==-1;
		}
		 public static boolean isFull(){
			return (rear+1)%size == front;
		 }
		public static void add(int data){
			if(isFull()){
				System.out.println("No space left");
				return;
			}
			
			if(front==-1){//if we are adding first time
				front=0;
			}
			rear = (rear+1)%size;
			cirQ[rear] = data;
//			size++;
		}
		public static int remove(){
			if(front==-1 && rear==-1){
				System.out.println("no element to remove");
				return -1;
			}
			int data = cirQ[front];
			if(front==rear){
				rear=front=-1;
			}
			else
			front = (front+1)%size;
			
			return data;
		}
		public static int peek(){
			if(isEmpty()){
				System.out.println("no element to display");
				return -1;
			}
			return cirQ[front];
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us implement circular queue by array");
		CircularQ que = new CircularQ(4);
		que.add(11);
		que.add(12);
		que.add(13);
		que.remove();
		while(!que.isEmpty()){
			System.out.println(que.peek());
			que.remove();
		}
	}
}
