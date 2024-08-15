package Algorithms.Greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SumOfMeanAbsolute {
	static int SumOfAbs(int[] a,int[] b){
		int sum=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			sum+= Math.abs(a[i]-b[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		return sum;
	}
	static int maxLengthPair(int[][] arr){
		ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
		int pair = 1;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0][0]);
		list.add(arr[0][1]);
		li.add(list);
		int chainEnd = arr[0][1];
		Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
		for (int i = 1; i < arr.length; i++) {
			if(arr[i][0]>=chainEnd){
				pair++;
				chainEnd = arr[i][1];
				list = new ArrayList<>();
				list.add(arr[i][0]);
				list.add(arr[i][1]);
				li.add(list);
			}
		}
		System.out.println(li);
		return pair;
	}
	static int IndianCoin(Integer[]coin,int amount){
		Arrays.sort(coin,Comparator.reverseOrder());
		int count = 0;
		ArrayList<Integer> coin_kind = new ArrayList<>();
		for (int i = 0; i < coin.length; i++) {
			if(coin[i]<amount){
				while(coin[i]<=amount) {
					count++;
					amount = amount - coin[i];
					coin_kind.add(coin[i]);
				}
			}
		}
		System.out.println(coin_kind);
		System.out.println("total coins needed"+count);
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Let us do other thing right away");
		int[] a= {1,-9,6,7};
		int[] b= {11,-9,62,7};
		int res = SumOfAbs(a,b);
		System.out.println(res);
		int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
		System.out.println(maxLengthPair(pairs));
		Integer coins[]={1,2,5,10,20,50,100,500,2000};
		IndianCoin(coins,590);
	}
}
