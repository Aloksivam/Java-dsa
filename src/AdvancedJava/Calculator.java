package AdvancedJava;
import java.rmi.*;
import java.rmi.server.*;
public class Calculator extends UnicastRemoteObject implements Icalculator{
	
	public  Calculator() throws RemoteException {
		super();
	}
	
	@Override
	public long add(long a, long b) throws RemoteException {
		return a+b;
	}
	
	@Override
	public long sub(long a, long b) throws RemoteException {
		return a-b;
	}
	
	@Override
	public long mul(long a, long b) throws RemoteException {
		return a*b;
	}
	
	@Override
	public long div(long a, long b) throws RemoteException {
		return a/b;
	}
}
