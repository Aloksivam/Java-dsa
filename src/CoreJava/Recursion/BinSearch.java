package CoreJava.Recursion;

public class BinSearch {
    public static void main(String[] args) {
       int x =  BinS(new int[]{5,44,46,52,61},44,0,4);
        System.out.println(x);
    }
    static int BinS(int[] arr,int target, int l, int h){
    if(l>h){
        return -1;
    }
    int m = l + (h-l)/2;
    if(target>arr[m]){
        return BinS(arr,target,m+1,h);
    }
    else if(target<arr[m]){
        return BinS(arr,target,l,m-1);
    }
    else{
        return m;
    }
    }
}
