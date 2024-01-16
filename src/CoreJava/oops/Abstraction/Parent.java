package CoreJava.oops.Abstraction;

public abstract class Parent {
	int age;
	
	public Parent(int age) {
		this.age = age;
	}
//	abstract constructor is not allowed
//	abstract Parent(int age) {
//		this.age = age;
//	}
	static void static_method(){
		System.out.println("hey i am present inside a static method present inside ");
	}
	
	void normal(){
		System.out.println("this is a normal method");
	}
	abstract void career();
	abstract void partner();
//	abstract static void not_static_method();--> static methods cannot be overriden so they are not used here
}
