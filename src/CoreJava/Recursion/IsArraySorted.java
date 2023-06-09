package CoreJava.Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,99,888};
        System.out.println(IsSorted(arr,0));
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
