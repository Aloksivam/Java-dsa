package Algorithms.Hashing;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTypes {
	public static void main(String[] args) {
		System.out.println("Let us learn various types of hashmap examples");
//		LinkedHashMap<String,String> map = new LinkedHashMap<>();// maintains insertion order
		TreeMap<String,String> map = new TreeMap<>();// sort according to keys
		map.put("alok2","shivam3");
		map.put("alok","shivam");
		map.put("alok3","shivam22");
		System.out.println(map);
		Set<String> set = map.keySet();
		System.out.println(set);
	}
}
