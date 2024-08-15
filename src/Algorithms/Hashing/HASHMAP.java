package Algorithms.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HASHMAP {
	public static void main(String[] args) {
		System.out.println("Let us learn hashmap");
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India",100);
		hm.put("China",110);
		hm.put("Pakistan",20);
		hm.put("Bhutan",1);
		hm.put("Bhutan",13);
//		System.out.println(hm);
//		System.out.println(hm.get("India"));
//		System.out.println(hm.get("Ban"));
//		System.out.println(hm.containsKey("Bhutan"));
//		System.out.println(hm.containsKey("Barh"));
//		System.out.println(hm.remove("Bhutan")) ;
//		System.out.println(hm.containsKey("Bhutan"));
//		System.out.println(hm.size());
//		System.out.println(hm.isEmpty());
//		System.out.println();
//		hm.clear();
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		for (String  k:
			 keys) {
			System.out.println("Key="+k+",value="+hm.get(k));
		}
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
//		for (int i = 0; i < keys.size(); i++) {
//			hm.get(keys)
//		}
//		System.out.println(hm.size());
	}
}
