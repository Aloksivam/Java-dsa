package Algorithms.HeapDS;

import java.util.PriorityQueue;
import java.util.*;

public class NearestCar {
	static class Point implements Comparable<Point> {
		int x,y;
		int distSq;
		int idx;
		
		public Point(int x, int y,int distSq,int idx) {
			this.x = x;
			this.y = y;
			this.distSq = distSq;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(Point p2) {
			return this.distSq-p2.distSq;
		}
	}
	public static int Kropes(int[] ropes){
		int i = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		while(i<ropes.length){
			pq.add(ropes[i]);
			i++;
		}
		int cost = 0;
//		while(!pq.isEmpty()){
//			int el1 = pq.remove();
//			if(pq.isEmpty()){
//
////			cost+=(el1);
//			break;
//			}
//			int el2 = pq.remove();
//			cost+=el1+el2;
//			pq.add(el1+el2);
////			pq.add(el1+el2);
//		}
		while(pq.size()>1){
			int min = pq.remove();
			int min2 = pq.remove();
			cost+=min+min2;
			pq.add(min+min2);
		}
		return cost;
	}
	public static void main(String[] args) {
		int pts[][] = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		System.out.println("I am going to find k no nearest car idea is simple calculate distance of each point and put them in a priority queue");
		PriorityQueue<Point> pq = new PriorityQueue();
		for (int i = 0; i < pts.length; i++) {
			int distSq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
			pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
		}
		for (int i = 0; i < k; i++) {
			System.out.println("C"+ pq.remove().idx);
		}
		int[] ropes = {2,3,3,4,6};
		System.out.println(Kropes(ropes));
	}
}
