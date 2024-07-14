package Algorithms.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class SetOperations {
	static int CountDistinct(int[]arr){
		HashSet<Integer> set = new HashSet<>();
//		HashMap<Integer,Integer> map = new HashMap<>();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		System.out.println(map.size()+" "+ set.size()+" "+map);
		return map.size();
	}
	public static void main(String[] args) {
		System.out.println("Let us understand intersection and union of sets ");
		int[] arr1= {7,3,9};
		int[] arr2 = {6,3,9,2,9,4};
		//union of two sets
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		int i;
		for ( i = 0; i <arr1.length ; i++) {
			set.add(arr1[i]);
			set2.add(arr1[i]);
		}
		System.out.println(set);
		for (int j = 0; j < arr2.length ; j++) {
			set.add(arr2[j]);
		}
		System.out.println(set);
		
		System.out.println("let us understand instersection of sets");
		int count=0;
		for (int j = 0; j < arr2.length; j++) {
			if(set2.contains(arr2[j])){
				System.out.print(arr2[j]+" ");
				set2.remove(arr2[j]);
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("Let us count nr of distict elements in an array");
		int[] arrmany = {1,2,1,4,5,6,4,7,33,7};
		System.out.println(CountDistinct(arrmany));
	}
}
