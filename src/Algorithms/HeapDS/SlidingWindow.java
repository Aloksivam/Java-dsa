package Algorithms.HeapDS;
import java.util.*;

public class SlidingWindow {
	static class pair implements Comparable<pair>{
		int val,idx;
		
		public pair(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(pair p2) {
			//;
			return p2.val-this.val;
		}
	}
//	public static int[] SlidingWindow(int[] arr,int k){
//		int[] res = new int[arr.length-k];
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//		pq.add(arr[0]);
//		pq.add(arr[1]);
//		pq.add(arr[2]);
//		for (int i =k; i < arr.length ; i++) {
//			res[i-k] = pq.remove();
//			pq.add(arr[i]);
//		}
//		return res;
//	}
	public static void main(String[] args) {
		System.out.println("Let us solve sliding window problem");
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k=3;
		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		int[] res = new int[arr.length-k+1];
		for (int i = 0; i < k; i++) {
			pq.add(new pair(arr[i],i));
		}
		//check for presence in windows
		res[0] = pq.peek().val;
		for (int i = k; i <arr.length ; i++) {
			while(pq.size()>0 && pq.peek().idx<=i-k){
				pq.remove();
			}
			pq.add(new pair(arr[i],i));
			res[i-k+1] = pq.peek().val;
		}
		System.out.println();
		System.out.println(Arrays.toString(res));
		
	}
}
