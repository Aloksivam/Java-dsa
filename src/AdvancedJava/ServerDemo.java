package AdvancedJava;
import java.net.MalformedURLException;
import java.rmi.*;
public class ServerDemo {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Icalculator ic = new Calculator();
		Naming.rebind("rmi://127.0.0.1:1099/CalculatorService",ic);
	}
}
