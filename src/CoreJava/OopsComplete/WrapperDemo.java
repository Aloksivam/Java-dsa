package CoreJava.OopsComplete;

public class WrapperDemo {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		swapWrapper(a,b);
		System.out.println(a+" "+ b);
	}
	static void swapWrapper(Integer a,Integer b){
		Integer temp = a;
		a = b;
		b= temp;
		
	}
	//in java everything is pass by value, like if you try to swap the value of a(int) and b(int) it will not work let us check the same for wrapper class
}
