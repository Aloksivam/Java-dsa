package CoreJava.WaysofCreatingObject;

// Here we will learn different ways of creating an object of a class
public class DemoClass {
	public int fvt;
	public void Intro(){
		System.out.println("I am present inside DemoClass");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		DemoClass dm = new DemoClass();
		dm.fvt = 45;
		Class c1 = Class.forName("DemoClass");
		// Creating a new reference variable dm2
		// pointing to same address as dm1
		DemoClass dm2 = dm;
////		dm.Intro();
//		dm2.Intro();
		System.out.println("my fvt is "+ dm2.fvt);
		// Any change made in ob2 will
		// be reflected in ob1
	}
}
