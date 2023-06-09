package CoreJava;

public class PreetyPrinting {
    public static void main(String[] args) {
//        System.out.println('a'+'b');
//        System.out.println('a'+3);
//        System.out.println((char)('a'+3));
//Performance();
        System.out.println(Ispalindrom("ab"));
    }
    static void Performance(){
        String st = "";
        for (int i = 0; i <26; i++) {
//            System.out.println((char)('a'+i));
            st+=(char)('a'+i);
        }
        System.out.println(st);
    }
    static boolean Ispalindrom(String str){
        if(str==null||str.length()==0)
            return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
        }return true;
    }
}
