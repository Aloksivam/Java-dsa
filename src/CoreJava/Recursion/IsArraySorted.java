package CoreJava.Recursion;

import java.util.ArrayList;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,99,6,6,888};
//        System.out.println(IsSorted(arr,0));
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list = allIndexadd(arr,6, 0,new ArrayList<>());
//        System.out.println(list);
    }

     static boolean IsSorted(int[] arr,int l) {
        if(l>=arr.length-1){
            return true;
        }
//        if(arr[l]>arr[l+1]){
//            return false;
//        }
//        return IsSorted(arr,l+1);
        return arr[l]<arr[l+1] && IsSorted(arr,l+1);
    }
    
}
