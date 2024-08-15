package Algorithms.HeapDS;

import java.util.Arrays;

public class HeapSort {
	public static void heapify(int[] arr, int i,int size){
		 int left = 2*i+1;
		 int right = 2*i+2;
		 int maxIdx = i;
		 if(left<size && arr[left]>arr[maxIdx]){
			 maxIdx = left;
		 }
		 if(right<size && arr[right]>arr[maxIdx]){
			 maxIdx = right;
		 }
		 if(i!=maxIdx){
			 int temp = arr[i];
			 arr[i] = arr[maxIdx];
			 arr[maxIdx] = temp;
		 }
	}
	
	public static void Heapsort(int[] arr){ //nlog(n)
//		step1 build maxheap
		int n =  arr.length;
		for (int i =n/2; i >=0 ; i--) {
			heapify(arr, i,n);
		}
//		step2 push largest at end
		for (int i = n-1; i >0; i--) {
			//swap
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,0,i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Hi, I am present inside HeapSort class where i am trying to implement heap sort whose steps are" +
				"for increasing order we use maxheap " +
				"but given heap will be in minheap form so we are gonna convert it it");
		int[] arr = {1,2,4,5,3};
		Heapsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
