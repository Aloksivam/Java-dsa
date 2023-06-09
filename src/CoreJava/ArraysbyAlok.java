package CoreJava;

import java.util.Arrays;

public class ArraysbyAlok
{
    static void swap(int[]arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    static void  rev(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            swap(arr,l,h);
            l++;
            h--;
        }
    }
    static void  rev2(int[] arr){
        int l = 0;
//        int h = arr.length-1;
        while(l<=(arr.length-1)/2){
            swap(arr,l,arr.length-1-l);
            l++;
        }
    }
    public static void main(String[] args) {
//        datatype [] variable_name = new datatype[];--> syntax
        int[] rnos = new int[5];
        int []arr1 = {2,4,8,9,33,-5,7,6};
        swap(arr1,arr1[0],arr1[1]);
        System.out.println(Arrays.toString(arr1));
        rev2(arr1);
        System.out.println(Arrays.toString(arr1));



    }
}
