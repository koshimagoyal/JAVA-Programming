import java.rmi.*;
import java.rmi.server.*;
public class CalculatorRemote extends UnicastRemoteObject implements Calculator
{
	CalculatorRemote() throws RemoteException
	{ super(); }
	public int add(int x, int y)
	{ return x+y; }
	public int sub(int x, int y)
	{ return x-y; }
	public void mul(int x, int y)
	{ System.out.println("Multiplication = "+(x*y));}
}