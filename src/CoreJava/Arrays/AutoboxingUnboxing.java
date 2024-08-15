package CoreJava.Arrays;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		int prim_int = 33;
		Integer WrapperInt = prim_int; // so this is an example of autoboxing that where conversion is taking place from primitive to wrapper class
		Character name_wrapper = 'a';
		char name = name_wrapper;
		System.out.println(WrapperInt+" "+name);
		System.out.println(WrapperInt);
		int n = 33;
		
		
	}
}
