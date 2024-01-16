package CoreJava.Stack;

import java.util.ArrayList;

public class StackB {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean isEmpty(){
			return list.size()==0;
		}
		
		public static void push(int data){
			list.add(data);
		}
		public static int pop(){
			if(!isEmpty()) {
				int data = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				return data;
			}
			return -1;
		}
		public static int peek(){
			return list.get(list.size()-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("LEt us implement stack by using ArrayList");
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
}
