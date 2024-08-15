package CoreJava.OopsComplete;

public class InnerClass {
	@Override
	public String toString() {
		return super.toString();
	}
	
	static class A{
		String name;
		
		public A(String name) {
			this.name = name;
		}
		
		static{
			System.out.println("A is here");
		}
		
		@Override
		public String toString() {
			return name;
		}
	}
	public static void main(String[] args) {
//		A obj = new A(); // will be created if A is static so we don't need an object of outer class to run
//		InnerClass cl = new InnerClass();
//		cl.A obj =  cl.A();
		A obj  = new A("alok");
		A obj2  = new A("sinha");
		System.out.println(obj.name);
		System.out.println(obj2.name);
		System.out.println(obj);
		System.out.println(obj2);
		//yeah it is not dependent on object of outer class but they themself can have their own properties
	}
}

