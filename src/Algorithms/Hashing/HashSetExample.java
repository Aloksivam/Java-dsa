//HashSet is implemented using HashMap so these have unique values as hashmap does not contain duplicate keys
package Algorithms.Hashing;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		System.out.println("Let us learn about hashset");
		HashSet<String> cities = new HashSet<>();
		cities.add("agra");
		cities.add("gaya");
		cities.add("delhi");
		cities.add("agra");
		Iterator it = cities.iterator(); //making an iterator interface object
		while (it.hasNext()){
			System.out.println(it.next()+" ");
		}
		
		for (String city :
				cities) {
			System.out.println(city);
		}
		LinkedHashSet<String> citiess = new LinkedHashSet<>(); //insertion order is maintained
		citiess.add("agra");
		citiess.add("gaya");
		citiess.add("delhi");
		citiess.add("agra");
		System.out.println(citiess);
		TreeSet<String> city = new TreeSet<>(); //gets sorted
		city.add("Agra");
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Katak");
		System.out.println(city);
	}
}
