package Algorithms.HeapDS;

import java.util.PriorityQueue;

public class WeakSoldier {
	static class Row implements Comparable<Row>{
		int soldiers,idx;
		
		public Row(int soldiers, int idx) {
			this.soldiers = soldiers;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(Row r2) {
		if(this.soldiers==r2.soldiers){
			return this.idx-r2.idx;
		}
		else{
		
		return this.soldiers-r2.soldiers;
		}
//			return 0;
		
		
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us find the row of weak soldiers i.e" +
				"we will be given binary matrix of soldier where 1 represents soldier and 0 represents civilian");
		
		int army[][] = {{1,0,0,0},
						{1,1,1,1},
						{1,0,0,0},
						{1,0,0,0}};
		int k = 2;
		PriorityQueue<Row> pq = new PriorityQueue<>();
		for (int i = 0; i < army.length; i++) {
			int count = 0;
			for (int j = 0; j < army[0].length; j++) {
				if(army[i][j]==1){
					count++;
				}
			}
			pq.add(new Row(count,i));
		}
		for (int i = 0; i < k; i++) {
			System.out.println("R"+pq.remove().idx);
		}
		
	}
}
