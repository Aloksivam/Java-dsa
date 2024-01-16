package CoreJava.Recursion.Patterns;

import java.util.Arrays;

public class Patterns01 {
	public static void main(String[]  args) {
//		triangle(3,0);
		int[] arr = {4,3,2,1};
		BubbleSort(3,0,arr);
		System.out.println(Arrays.toString(arr));
	}
	static  void rev_triangle(int r,int c){
		if(r==0){
			return;
		}
		if(r>c){
		System.out.print("*");
			rev_triangle(r,c+1);
		}
		else {
			System.out.print("\n");
			rev_triangle(r - 1, 0);
		}
	}
	static  void triangle(int r,int c){
		if(r==0){
			return;
		}
		if(r>c){
			triangle(r,c+1);
		System.out.print("*");
		}
		else {
			triangle(r - 1, 0);
			System.out.print("\n");
		}
	}
	static void BubbleSort(int r,int c,int[] arr){
		if(r==0){
			return;
		}
		if(c<r){
			if(arr[c]>arr[c+1]){
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1] = temp;
			}
			BubbleSort(r,c+1,arr);
		}
		else{
			BubbleSort(r-1,0,arr);
		}
	}
}
