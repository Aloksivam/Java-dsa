package CoreJava.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibtilln(6));
    }
    static int fibtilln(int n){
        if(n==0||n==1){
            return n;
        }
        else
            return fibtilln(n-1)+fibtilln(n-2);


    }
}
