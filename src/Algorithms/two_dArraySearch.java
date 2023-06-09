package Algorithms;

import java.util.Arrays;

public class two_dArraySearch {
    static int[] search2d(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    int[] ind ={i+1,j+1};
                    return ind;// return new int[]{i+1,j+1};
                }

            }
        }
        int def[] = {-1,-1};
        return def;
    }
    public static void main(String[] args) {
        int[][] tes3=new int[][]{
                {1,2,4},
                {2,7},
                {4,7,9,33}
        };
//        int[] fin = search2d(tes3,33);
        System.out.println(Arrays.toString(search2d(tes3,33)));
        System.out.println(Integer.MAX_VALUE);
//        if(fin[0]!=-1)
//            System.out.println("present at row no "+fin[0]+ " and col no "+ fin[1]);
//        else{
//            System.out.println("it is not present");
//        }

    }
}
