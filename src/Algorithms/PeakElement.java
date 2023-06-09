package Algorithms;

public class PeakElement {
    public static void main(String[] args) {
//    int arr[]
    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){//desc part of array
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){//ascending part of array
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
