import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Number{
	int a;
	int b;
	double result;
	Number(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		System.out.println("Addition = "+(a+b));
	}
	void sub()
	{
		System.out.println("Subtraction = "+(a-b));
	}
	void mul()
	{
		System.out.println("Multiplication = "+(a*b));
	}
	void div()
	{
		if(b==0)
			throw new ArithmeticException("not able to divide");
		else
		{
			System.out.println("Division = "+(a/b));
		}
	}
	public static void main(String args[]) throws IOException
	{
		System.out.println("Menu");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("enter the choice");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch = Integer.parseInt(br.readLine());
		Number n = new Number(2,0);
		try
		{
			switch(ch){
				case 1: n.add();
					break;
				case 2: n.sub();
					break;
				case 3: n.mul();
					break;
				case 4: n.div();
					break;
				default: System.out.println("wrong choice");
					 break;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannt divide by zero"+e);
		}
	}
}
			
