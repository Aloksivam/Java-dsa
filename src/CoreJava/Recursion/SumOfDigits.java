package CoreJava.Recursion;

public class SumOfDigits {
    static int sum = 0;
    static int rem;
    static void RevNr(int n) {
        if (n==0)//(n==0)
            return ;//return 1;
        else {
            rem = n%10;
            sum = sum*10+ rem;
            RevNr(n/10);

        }
    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        int n = 99892;
//        System.out.println(SumDig(n));
//        System.out.println(ProdDig(n));
//        RevNr(n);
//        System.out.println(sum);
//        System.out.println(rev2(008979900100));
        System.out.println(countNoOfDig(3400100,0,0));
    }


    static int SumDig(int n) {
        if (n == 0)
            return 0;
        else {
            return n % 10 + SumDig(n / 10);
        }
    }

    static int ProdDig(int n) {
        if (n%10==n)//(n==0)
            return n;//return 1;
        else {
            return n % 10 * ProdDig(n / 10);
        }
    }
    static int countNoOfDig(int n,int count,int key){
        if(n==0){
            return count;
        }
            if(n%10==key){
                return countNoOfDig(n/10,count+1,key);
            }
            else{
                return countNoOfDig(n/10,count,key);
            }
    }


}

