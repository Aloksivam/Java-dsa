package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		System.out.println("we will understand about list interface");
		System.out.println("without generic it can accept any type of ");
		List li = new ArrayList();
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr,new Integer[]{1,2,3,0,-1,6});
		Collections.sort(arr);
		System.out.println(arr);
		
		li.add(1);
		li.add(12);
		li.add(13);
		li.add(1);
		li.add("alok");
		li.set(0,"ananya");
		System.out.println(li);
		System.out.println("alok".length());
//		System.out.println("alok".contains([1-9]));
	}
}

