package CoreJava.Recursion;

import java.util.ArrayList;

public class LinSearch {
    static ArrayList<Integer> list = new ArrayList<>();
    private static void FindAllIndex(int[] arr,int target, int i) {
        if(i==arr.length){
            return;
        }

        if(arr[i]==target){
            list.add(i);
        }
        FindAllIndex(arr,target,i+1);

    }
    private static ArrayList<Integer> FindAllIndex(int[] arr,int target, int i,ArrayList<Integer> list) {
        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }
       return  FindAllIndex(arr,target,i+1,list);

    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,9,-3,99,3,-3};
        int target = -3;
//        System.out.println(linS(arr,1,0));
        FindAllIndex(arr,3,0);
        ArrayList<Integer> list1 = FindAllIndex(arr,target,0,new ArrayList<Integer>());
        System.out.println(list1);
//        System.out.println(list);
    }

    private static int linS(int[] arr,int target, int i) {
        if(i==arr.length){
            return -1;
        }
        else{
            if(arr[i]==target){
                return i;
            }
            return linS(arr,target,i+1);
        } }


}
