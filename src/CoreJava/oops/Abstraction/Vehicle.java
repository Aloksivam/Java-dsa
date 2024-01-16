package CoreJava.oops.Abstraction;

abstract class Vehicle {
	int wheels;
	abstract void calculate();
	void display(){
		System.out.println("this is display method of abstract class");
	}
}
class car extends Vehicle{
	@Override
	void calculate() {
		System.out.println("this is implemented calculate method");
	}
	
	@Override
	void display() {
		System.out.println("this is overriden display method");
	}
	void execute(){
		System.out.println("car is going");
	}
}
class bike extends Vehicle{
	@Override
	void calculate() {
		System.out.println("under bike class this is implemented calculate method");
	}
	
	@Override
	void display() {
		System.out.println("under bike class this is overriden display method");
	}
	void operate(){
		System.out.println("Bike is moving");
		
	}
}

class Test{
	public static void main(String[] args) {
		Vehicle v = new car();// widening
		v.display();
		v = new bike();
		v.display();
//		v.execute();
		bike b1 = (bike)v;
		b1.operate();
		
//		super class reference can refer to any of its child class object but child class reference can never refer to its superclass object.
		
	}
}
