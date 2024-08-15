package CoreJava.OopsComplete;

public class StaticExample {
	static int a=4;
	static int b;
	static {
		b=a*5;
	}
	public static void main(String[] args) {
		System.out.println(b);
		b++;
		System.out.println(b);
		
	
	}
}
