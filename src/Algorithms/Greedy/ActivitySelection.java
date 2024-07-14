package Algorithms.Greedy;

import java.util.*;

public class ActivitySelection {
	static Queue<Integer> Activity(int[] start,int[] end){
		Deque<Integer> q = new LinkedList<>();
		q.add(0);
		int counter = 0;
		for (int i = 1; i < start.length; i++) {
			if(start[i]>=end[q.getLast()]){
				q.addLast(i);
				counter++;
			}
		}
		return q;
	}
	
	public static void main(String[] args) {
		System.out.println("Let us do activity selection using greedy algorithm steps are" );
		int[] start ={1,3,0,5,8,5};
		int[] end = {2,4,6,7,9,9};
//		Queue<Integer> res = Activity(start,end);
//		System.out.println(res);


//		int maxAct = 0;
//		ArrayList<Integer> ans = new ArrayList<>();
//		maxAct = 1;
//		ans.add(0);
//		int lastEnd = end[0];
//		for (int i = 1; i < end.length; i++) {
//			if(start[i]>=lastEnd){
//				maxAct++;
//				ans.add(i);
//				lastEnd = end[i];
//			}
//	 	}
//		System.out.println("Maximum activities allowed are "+maxAct);
//		for (int i = 0; i < ans.size(); i++) {
//			System.out.println("A"+ans.get(i)+" ");
//		}
//
//		//WHat if? we have to sort the array according to increasing order of finish
//		int activities[][] = new int[start.length][3];
//		for (int i = 0; i < start.length; i++) {
//			activities[i][0] = i;
//			activities[i][1] = start[i];
//			activities[i][2] = end[i];
//		}
		
		int activities[][] = new int[start.length][3];
		for (int i = 0; i < start.length; i++) {
			activities[i][0] = i;
			activities[i][1] = start[i];
			activities[i][2] = end[i];
		}
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
		int maxAct = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		maxAct = 1;
		ans.add(activities[0][0]);
		int lastEnd = activities[0][2];
		for (int i = 1; i < end.length; i++) {
			if(activities[i][1]>=lastEnd){
				maxAct++;
				ans.add(activities[i][0]);
				lastEnd = activities[i][2];
			}
	 	}
		System.out.println("Maximum activities allowed are "+maxAct);
		for (int i = 0; i < ans.size(); i++) {
			System.out.println("A"+ans.get(i)+" ");
		}

		//WHat if? we have to sort the array according to increasing order of finish
		
		
		
	}
}
