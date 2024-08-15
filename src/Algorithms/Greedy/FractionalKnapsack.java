package Algorithms.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
	public static void main(String[] args) {
		System.out.println("Let us solve fractional knapsack problems by greedy approach and 0/1 knapsack is solved by Dynamic programming");
		int val[] = {60,100,120};
		int[] weight = {10,20,30};
		int w = 50;
		double knapsack[][] = new double[val.length][2];
		for (int i = 0; i < val.length; i++) {
			knapsack[i][0]=i;
			knapsack[i][1]=val[i]/(double)weight[i];
		}
		Arrays.sort(knapsack, Comparator.comparingDouble(o->o[1]));
		ArrayList<Double> bag = new ArrayList<>();
		int capacity = w;
		int finalval	 = 0;
		for (int i = val.length-1; i >=0 ; i--) {
			int idx = (int)knapsack[i][0];
			if(capacity>=weight[idx]){
				finalval+=val[idx];
				capacity = capacity-weight[idx];
			}
			else{
				finalval+=(knapsack[i][1]*capacity);
				capacity=0;
				break;
			}
			
		}
		System.out.println(finalval);
	}
}
