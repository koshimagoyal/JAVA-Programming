import java.rmi.*;
public class MyClient
{
	public static void main(String args[])
	{
		try
		{
			Calculator stub = (Calculator) Naming.lookup("rmi://localhost:5000/sonoo");
			System.out.println("Addition = "+stub.add(34,4));
			stub.mul(2,3);
			System.out.println("Subtraction = "+stub.sub(12,2));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}