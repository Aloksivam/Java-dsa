
package AdvancedJava;
import java.rmi.*;
public class ClientDemo {
	public static void main(String[] args) throws Exception{
		Icalculator ic =(Icalculator) Naming.lookup("rmi://127.0.0.1:1099/CalculatorService");
		System.out.println(ic.add(10,11));
		System.out.println(ic.sub(100,11));
		System.out.println(ic.mul(10,11));
		System.out.println(ic.div(8,11));
//		System.out.println(ic.add(10,11));
	
	}
}
