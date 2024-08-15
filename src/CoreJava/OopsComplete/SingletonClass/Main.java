package CoreJava.OopsComplete.SingletonClass;

public class Main {
	public static void main(String[] args) {
		SingletonDemo sd1 = SingletonDemo.getInstance();
		SingletonDemo sd2 = SingletonDemo.getInstance();
		SingletonDemo sd3 = SingletonDemo.getInstance();
		System.out.println(sd1);
		System.out.println(sd2);
		System.out.println(sd3);
	}
	
	
}
