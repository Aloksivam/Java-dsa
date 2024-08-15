package Algorithms.Hashing;

import java.util.HashMap;
import java.util.Set;

public class Test {
	static void MajorityEl(int[] arr, int n){
		HashMap<Integer,Integer> ele = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			ele.put(arr[i],ele.getOrDefault(arr[i],0)+1);
		}
			for (Integer key :
					ele.keySet()) {
			if(ele.get(key)>n/3)
			{
				System.out.print(key+" ");
			}

		}
//		for (int i = 0; i < ele.size(); i++) {
//			if(ele.get(arr[i])>n/3)
//			{
//				System.out.print(arr[i]);
//			}
		}
//	}
	
	static boolean IsAnagram(String s, String t){ //Anagram are the words which are formed by rearrangements of word
		boolean isAngrm = true;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		if(s.length()!=t.length()){
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			map1.put(s.charAt(i),1);
			map2.put(t.charAt(i),1);
		}
		for (int i = 0; i < s.length(); i++) {
			if(map1.get(s.charAt(i))!=map2.get(s.charAt(i))){
				return false;
			}
		}
		return true;
	}
	static boolean IsAnagramm(String s, String t){ //Anagram are the words which are formed by rearrangements of word
		boolean isAngrm = true;
		HashMap<Character,Integer> map1 = new HashMap<>();
//		if(s.length()!=t.length()){
//			return false;
//		} // condition removed for checking of phrases where they might have unequal length due to space inclusion
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' '){
				continue;
			}
			map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
//			map2.put(t.charAt(i),1);
		}
		for (int i = 0; i < t.length(); i++) {
			if(t.charAt(i)==' '){
				continue;
			}
			if(map1.containsKey(t.charAt(i))){
				if(map1.get(t.charAt(i))==1){
					map1.remove(t.charAt(i));
				}
				else
				map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
			}
			else{
				return false;
			}
		}
		return map1.isEmpty();
	}
	public static void main(String[] args) {
		System.out.println("Let us solve some questions related to hashmap");
		//Majority Element
		int[] nums = {1,3,3,3,2,5,1,3,1,5,1};
		MajorityEl(nums, nums.length);
//		System.out.println(IsAnagramm("alokio","kibola"));
		System.out.println(IsAnagramm("a decimal point","im a dot in place"));
	}
}
