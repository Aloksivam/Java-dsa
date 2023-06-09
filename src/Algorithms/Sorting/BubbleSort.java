package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {6,5,4,43,2,1};
//        int[] arr = {6,2,24,33,42,51};

//        Bubble(arr);
//        SelSort(arr);
//        InsertionSort(arr);
//        InsSort(arr);
        int[] arr = {3,5,2,1,0,4};
//        CycSort(arr);
        CyclSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean swap = false;
        int count = 0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            swap = false;
            for (int j = 0 ; j <=arr.length-1-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                    count++;
                System.out.println(Arrays.toString(arr));
            }
            if(!swap){
                break;
            }
        }
        System.out.println(count);
    }
    static void SelSort(int[] arr){
//         int max;
        for (int j = 0; j < arr.length; j++) {
        int last = arr.length-j-1;
        int max = Maxmtill(arr,0, last);

        if(max!=last){
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }



        }
    }
        static int Maxmtill(int[]arr,int i,int l){
        int mxm = i;
        for(int j=0;j<=l;j++){
            if(arr[j]>arr[mxm]){
                mxm = j;
            }
        }
        return mxm;

        }

        static void InsertionSort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                int key = i-1;
                int j = arr[i];
                while(key>=0 &&j<arr[key]){
                    arr[key+1] = arr[key];
                    key--;
                }
//                int temp = arr[j];
//                arr[j] = arr[key];
//                arr[key] = temp;
//                arr[i] = arr[key];
                arr[key+1] = j;
            }
        }

        static void InsSort(int[] arr){
            for (int i = 0; i <= arr.length-2; i++) {
                for (int j = i+1; j>0 ; j--) {
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                    else{
                        break;
                    }
                }

            }
        }
        static void CycSort(int[] arr){
            int i = 0;
            while(i<arr.length){
                if(arr[i]!=i+1){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }
                else
                i++;
            }
        }
    static void CyclSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]!=i){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
            else
                i++;
        }
    }

//        static int miss(int []arr){
//        int len = arr.length-1;
//
//        }
}
