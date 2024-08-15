package CoreJava.Arrays;
import  java.util.ArrayList;
import  java.util.AbstractList;
//import java.util.Cop
import  java.util.Collections; //for sorting an arraylist we req
public class ArrayListExample {
	static void MonoTonicOrNot(ArrayList<Integer> lit){
		boolean isMonotonicInc = true,isMonotonicDec=true;
		for (int i = 0; i < lit.size()-1; i++) {
			if(lit.get(i)<=lit.get(i+1)){
				isMonotonicInc = true;
			}
			else{
				isMonotonicInc = false;
				break;
			}
		}
		if(!isMonotonicInc){
			for (int i = 0; i < lit.size()-1; i++) {
				if(lit.get(i)>=lit.get(i+1)){
					isMonotonicDec = true;
				}
				else{
					isMonotonicDec = false;
					break;
				}
			}
		}
		if(isMonotonicInc)
		System.out.println("Monotonic increasing");
		else if(isMonotonicDec)
		System.out.println("Monotonic decreasing");
		else{
			System.out.println("it is none");
		}
	}
//	public static ArrayList LonelyList(ArrayList<Integer> list){
//		ArrayList<Integer> res = new ArrayList<>();
//		Collections.sort(list);
//		for (int i = 0; i < list.size(); i++) {
//			if(i==0){
//				if(list.get(i+1)==list.get(i)||list.get(i+1)==list.get(i))
//			}
//		}
//	}
	public static void main(String[] args) {
		System.out.println("checking that whether it is working");
//		ArrayList<Integer> nrs = new ArrayList<Integer>();
//		nrs.add(99);
//		System.out.println(nrs);
//		System.out.println(nrs.get(0));
//		nrs.set(0,11);//set the 1st element to 11
//		nrs.remove(0);//to remove the 1st element
//		nrs.clear();//to clear whole list
//		System.out.println(nrs.size());
//		nrs.add(12);
//		nrs.add(13);
//		nrs.add(-9);
//		Collections.sort(nrs);
//		System.out.println(nrs);
//		//for sorting in descending order
//		Collections.sort(nrs,Collections.reverseOrder());
//		System.out.println(nrs);
//		System.out.println(nrs.contains(-9));
//		nrs.add(2,33); // will addd the element 33 at third position and shift elements after this to 1 place right
//		System.out.println(nrs);
		
		
		//Let us learn about mutlidimensional arraylist
//		ArrayList<ArrayList<Integer>> main = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		main.add(list)<;
//		list1.add(67);
//		list1.add(68);
//		list1.add(97);
//		main.add(list1);
//		System.out.println(main);
//		for (int i = 0; i < main.size(); i++) {
//			ArrayList<Integer> li = main.get(i);
//			for (int j = 0; j < li.size(); j++) {
//				System.out.println(li.get(j));
//			}
//		}

		
		
		//How to add multiple items at a time to an ArrayList
		ArrayList<Integer> empty = new ArrayList<>();
		ArrayList<Integer> empty2 = new ArrayList<>();
		Collections.addAll(empty,1,2,3,4);
		Collections.addAll(empty2,11,23,34,45);
		empty.add(12);
		empty.addAll(empty2);
		System.out.println(empty);
		
		//Check whether given ArrayList is monotonically increasing or decreasing
		ArrayList<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1,1,2,3);
		MonoTonicOrNot(list1);
		ArrayList<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2,6,5,4,4);
		MonoTonicOrNot(list2);
	}
}
