package Algorithms;

public class RotatedArrays {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7,8};
        System.out.println(pivot(arr));
//        System.out.println(printName("ALok"));
    }
    static int searchinrotated(int[] arr, int target) {
        int l=0;
        int h = arr.length-1;
        int pvt = pivot(arr);
        if (pvt == -1) {
            return BinSearchIndexed(arr, 0, arr.length-1, target);
        }
        else {
            if (arr[pvt] == target)
                return pvt;
            else if (target > arr[l]) {//{2,3,4,6,7,-1,0} let target = 6
                return BinSearchIndexed(arr, l, pvt - 1, target);
            } else {
                return BinSearchIndexed(arr,pvt+1,h,target);//{//{2,3,4,6,7,-1,0} and target is -1
            }
        }
}
    static int BinSearchIndexed(int arr[],int l,int h,int target){
//                int l = 0;
//                int h = arr.length-1;
        int mid;
        while(l<=h){
            mid = l+(h-l)/2;
            if(target<arr[mid]){
                h=mid-1;
            } else if (target>arr[mid]) {
                l = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){//desc part of array
                return mid;
            }
            else if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){//{7,1,2,3,4,5,6}
                end = mid-1;
            }
            else{
                start =  mid+1;
            }
            }
        return -1;
    }
    static int NoOfTimeRotated(int[] arr){
        return pivot(arr)+1;
    }

}

