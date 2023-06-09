package Algorithms;
import java.lang.Exception;
public class BinarySearch {
static int BinSearch(int arr[],int target){
        int l = 0;
        int h = arr.length-1;
        int mid;
        while(l<h){
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
       public static int RevBinSearch(int arr[],int l,int h,int target){
//                int l = 0;
//                int h = arr.length-1;
                int mid;
                while(l<h){
                        mid = l+(h-l)/2;
                        if(target<arr[mid]){
                                h=mid+1;
                        } else if (target>arr[mid]) {
                                l = mid-1;
                        }
                        else{
                                return mid;
                        }
                }
                return -1;
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

        static int ceiling(int arr[],int target){
                int l = 0;
                int h = arr.length-1;
                int mid;
                if(arr[arr.length-1]<target){
                        return -1;
                }
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
                return l;
        }

        static int floor(int arr[],int target){
                int l = 0;
                int h = arr.length-1;
                int mid;
                if(arr[arr.length-1]<target){
                        return -1;
                }
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
                return h;
        }
        static int Infinitelen(int[] arr,int target)throws ArrayIndexOutOfBoundsException{
                int start=0;
                int end = 1;
                while(target>arr[end]){
                        int temp = end+1;
                        end = end + (end-start+1)*2;
                        start = temp;
                }
                return BinSearchIndexed(arr,start,end,target);
        }
        public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int arr[]={1,2,3,57,999,1212,18999};
//        int target = 4;
//                System.out.println();
//                System.out.println(arr[ceiling(arr,4)]);
                System.out.println(Infinitelen(arr,57));

        }

}
