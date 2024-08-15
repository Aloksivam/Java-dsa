package CoreJava.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumVolContainer {
	public static int Maxwater(ArrayList<Integer> height){ //it is brute force method
		int max = 0;
		int wid=0,len=0;
		for (int i = 0; i < height.size(); i++) {
			for (int j = i+1; j <height.size() ; j++) {
				wid = j-i;
				len= Math.min(height.get(i),height.get(j));
				if(max<wid*len){
					max = wid*len;
				}
			}
		}
		return max;
	}
	//Above function has a time complexity of O(n^2)
	//here is a two pointer method which will run in O(n)
	public static int Maxwater_twoPointer(ArrayList<Integer> height){
		int max = 0,wid=0,len=0,lp=0,rp = height.size()-1;
		while(lp<rp) {
				wid = rp-lp;
				len= Math.min(height.get(lp),height.get(rp));
				if(max<wid*len){
					max = wid*len;
				}
			if(height.get(lp)<height.get(rp)){
				lp++;
			}
			else{
				rp--;
				}
			}
		
		return max;
	}
	public static ArrayList MaxPairSum(ArrayList<Integer> li,int target){
		ArrayList <Integer> pair = new ArrayList<>();
		int stl = 0,endl = li.size()-1,res;
		pair.add(0);
		pair.add(li.get(endl));
		while(stl!=endl){
			res = li.get(stl)+li.get(endl);
			if(res==target){
				pair.set(0,stl);
				pair.set(1,endl);
				return pair;
			} else if (res<target) {
				stl++;
			}
			else{
				endl--;
			}
		}
		return pair;
	}public static ArrayList MaxPairSumRotated(ArrayList<Integer> li,int target){
		int pivot= li.size()-1;
		for (int i = 0; i <li.size() ; i++) {
			if(li.get(i)>li.get(i+1)){
				pivot = i;
				break;
			}
		}
		System.out.println("pivot is "+pivot);
		ArrayList <Integer> pair = new ArrayList<>();
		int stl = pivot+1,endl = pivot,res;
		pair.add(0);
		pair.add(li.get(endl));
		while(stl!=endl){
			res = li.get(stl)+li.get(endl);
			if(res==target){
				pair.set(0,stl);
				pair.set(1,endl);
				return pair;
			} else if (res<target) {
				stl = (stl+1)%li.size();
			}
			else{
				endl=(endl-1+li.size())%li.size();
			}
		}
		return pair;
	}
	
	//to find sum of maximum of rotated arrays
	
	public static void main(String[] args) {
		System.out.println("Hi,I have started to solve container with most water problems");
		int[] height = {1,8,6,2,5,4,8,3,7};
		ArrayList<Integer> arr = new ArrayList<>();
		Collections.addAll(arr,1,8,6,2,5,4,8,3,7);
		System.out.println(Maxwater(arr));
		System.out.println(Maxwater_twoPointer(arr));
		
		ArrayList<Integer> pairfind = new ArrayList<>();
		ArrayList<Integer> pairfind2 = new ArrayList<>();
		Collections.addAll(pairfind,1,2,3,4,5,6);
		Collections.addAll(pairfind2,11,15,6,8,9,10);
//		System.out.println(MaxPairSum(pairfind,5));
		System.out.println(MaxPairSumRotated(pairfind2,15));
	}
}
