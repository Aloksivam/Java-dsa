package Algorithms.HeapDS;

import java.util.ArrayList;

public class Heap {
	static class Heapp{
		ArrayList<Integer> li = new ArrayList<>();
		public void add(int data){
			li.add(data);
			int x = li.size()-1; //x is child index
			int par = (x-1)/2;
			while(li.get(x)<li.get(par)){ //O(logn) minheap
//			while(li.get(x)>li.get(par)){ //O(logn) maxheap
				//swap
				int temp = li.get(x);
				li.set(x,li.get(par));
				li.set(par,temp);
				x = par;
				par = (x-1)/2;
			}
		}
		public int peek(){
			if(li.isEmpty()){
				return -1;
			}
			return li.get(0);
		}
		private void heapify(int i){
			int left = 2*i+1;
			int right = 2*i+2;
			int minIdx = i;
			//sometimes, i might be leaf node
			if(left<li.size() && li.get(minIdx)>li.get(left)){
//			if(left<li.size() && li.get(minIdx)<li.get(left)){
				minIdx = left;
			}
			if(right<li.size() && li.get(minIdx)>li.get(right)){
//			if(right<li.size() && li.get(minIdx)<li.get(right)){
				minIdx = right;
			}
			if(i!=minIdx){
				
				int temp  = li.get(i);
				li.set(i,li.get(minIdx));
				li.set(minIdx,temp);
				heapify(minIdx);
			}
			
		}
		public int remove(){
			int temp = li.get(0);
//			int temp = li.get();
			//swap first and last index elements
			li.set(0,li.get(li.size()-1));
			li.set(li.size()-1,temp);
			
			//delete the last
			li.remove(li.size()-1);
			
			//heapify takes O(logn)
			heapify(0);
			return temp;
		}
	public boolean isEmpty(){
		return li.size()==0;
	}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello There, I am studying about Heaps");
		Heapp h = new Heapp();
		h.add(12);
		h.add(13);
		h.add(1);
		while (!h.isEmpty()){
			System.out.println(h.peek());
			h.remove();
		}
	}
}
