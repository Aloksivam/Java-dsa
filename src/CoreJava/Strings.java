package CoreJava;

public class Strings {
    public static void main(String[] args) {
        String name = "Alok";
        String name2 = "Alok";
        System.out.println(name==name2);
        String n1 = new String("Alok");
        String n2 = new String("Alok");
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
        float nr = 4.567f;
        System.out.printf(" nr is %.2f ",nr);//round off and will print only 2 digit after decimal place
    }
}
