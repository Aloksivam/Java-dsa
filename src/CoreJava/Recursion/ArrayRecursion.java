package CoreJava.Recursion;

import Algorithms.RotatedArrays;

import java.util.ArrayList;

public class ArrayRecursion {
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,99,6,6,888,6};
//		ArrayList<Integer> list = allIndexadd(arr,6,0,new ArrayList<>());
		ArrayList<Integer> list = allIndexadd2(arr,6,0);
		System.out.println(list);
		int[] arr2= {5,6,7,8,9,1,2,3};
//		int target1 = 7;
		int target1 = 2;
		System.out.println(RotatedBinSearch(arr2,target1,0,arr2.length-1));
		
	}
	static int FindIndex(int[] arr,int target,int index) {
		if(index>=arr.length-1){
			return -1;
		}
		if(arr[index]==target){
			return index;
		}
		return FindIndex(arr,target,index+1);
		
	}
	static int lastIndex(int[] arr,int target,int index) {
		if(index==-1){
			return -1;
		}
		if(arr[index]==target){
			return index;
		}
		return lastIndex(arr,target,index-1);
		
	}
	static ArrayList<Integer> list = new ArrayList <>();
	static void allIndex(int[] arr,int target,int index) {
		if(index==arr.length){
			return;
		}
		if(arr[index]==target){
			list.add(index);
		}
		allIndex(arr,target,index+1);
	}
	
	static ArrayList allIndexadd(int[] arr,int target,int index,ArrayList<Integer> list){
//        ArrayList<Integer> list = new ArrayList <>();
		if(index==arr.length){
			return list;
		}
		if(arr[index]==target){
			list.add(index);
		}
		return allIndexadd(arr,target,index+1,list);
	}
	static ArrayList<Integer> allIndexadd2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList <>();
		if(index==arr.length){
			return list;
		}
		if(arr[index]==target){
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls = allIndexadd2(arr,target,index+1);
		list.addAll(ansFromBelowCalls);
		return list;
	}
	static int RotatedBinSearch(int[] arr,int target,int l,int h){
		if(l>h){
			return  -1;
		}
		int mid = l+ (h-l)/2;
		if(arr[mid]==target){
			return mid;
		}
		if(arr[l]<=arr[mid]){
			if(target>=arr[l]&&target<=arr[mid]){
//				h = mid-1;
				return RotatedBinSearch(arr,target,l,mid-1);
			}
			else
			{
				return RotatedBinSearch(arr,target,mid+1,h);
			}
		}
		if(target>=arr[mid]&&target<=arr[h]){
			return RotatedBinSearch(arr,target,mid+1,h);
		}
			return RotatedBinSearch(arr,target,l,mid-1);
	}
}
