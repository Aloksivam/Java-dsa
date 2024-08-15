package Algorithms.Hashing;

import java.util.HashMap;

public class MaximumSubarraySumK {
	public static void main(String[] args) {
		System.out.println("Let us find length of maximum subarray whose sum equals to k");
		int[] arr = {10,2,-2,-20,10};
		int k = -10;
		HashMap<Integer,Integer> map = new HashMap<>();
		//(sum,count)
		map.put(0,1);
		int sum=0,result=0;
		for (int j = 0; j < arr.length; j++) {
			sum+=arr[j];
			if(map.containsKey(sum-k)){
				result+=map.get(sum-k);
			}
			map.put(sum,result);
		}
	}
}
