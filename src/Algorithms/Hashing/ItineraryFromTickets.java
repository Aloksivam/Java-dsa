package Algorithms.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ItineraryFromTickets {
	public static void LargestSubarraysum0(int[] arr){
		int len=0,sum=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i <arr.length; i++) {
			sum+=arr[i];
			if(map.containsKey(sum)){
				len = Math.max(len,i-map.get(sum));
			}
			else{
				map.put(sum,i);
			}
		}
		System.out.println("Largest sbarray is "+len);
	
	}
	public static String getStart(HashMap<String,String> tickets){
		HashMap<String,String> revMap = new HashMap<>();
		for (String key :
				tickets.keySet()) {
			revMap.put(tickets.get(key),key);
		}
		for (String key:
				tickets.keySet()) {
			if(!revMap.containsKey(key)){
				return key;
			}
		}
		return null;
	}
	public static void main(String[] args) {
//		System.out.println("Let us understand the concept first we will ");
//		HashMap<String,String> tickets = new HashMap<>();
//		tickets.put("Chennai","Bengaluru");
//		tickets.put("Mumbai","Delhi");
//		tickets.put("Goa","Chennai");
//		tickets.put("Delhi","Goa");
//		String start = getStart(tickets);
//		System.out.print(start);
//		while (tickets.containsKey(start)){
//			System.out.print("-->"+tickets.get(start));
//			start = tickets.get(start);
//		}
		System.out.println("length of largest subarray having sum 0 is ");
		int arr[] = {15,-2,2,-8,1,7,10,23};
		LargestSubarraysum0(arr);
	}
}
