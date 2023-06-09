package CoreJava;
import java.util.Scanner;

public class AdvJava {
    static int Maxof3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
         int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         int n3 = sc.nextInt();
        int max = Math.max(n1,Math.max(n2,n3));
        return max;
    }
    static boolean isupper(){
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        char c = sc.next().trim().charAt(0);
        if(c>='A' && c<= 'Z'){
            System.out.println("yes it is upppercase");
            return true;
        }
        System.out.println("no it is not upppercase");

        return false;
    }
    public static void main(String[] args) {
//        System.out.println(Maxof3(8,4,-8));
        boolean re = isupper();

    }
}
