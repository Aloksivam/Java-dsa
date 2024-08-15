package CoreJava.oops.Abstraction;

//import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class son extends Parent {
	
	public son(int age) {
		super(age);
	}
	
	@Override
	void career() {
		System.out.println("i want to be a programmer");
	}
	
	@Override
	void partner() {
		System.out.println("i love pepper pots");
		
	}
}
