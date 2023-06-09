package CoreJava.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);

    }
}
