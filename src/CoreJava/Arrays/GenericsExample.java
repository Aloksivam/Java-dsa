package CoreJava.Arrays;
import  java.util.*;
public class GenericsExample {
	public static void main(String[] args) {
		System.out.println("let us learn about generics");
		List list = new ArrayList();
		list.add("Alok");
		list.add(13);
		//so without generics it can add anytype of objects like String or integers
		ArrayList list3 = new ArrayList();
		list3.add("hi arraylist");//Adding string
		list3.add(9);//adding integers
		//trying to add different objects even after adding generics
//		ArrayList<> list = new ArrayList();//no, we cannot use unspecified generics
		List<Integer> listco = new ArrayList<>();
		listco.add(9);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
