package igit.rollno.name;
class GreeterTest{
	public static void main(String args[])
	{
		int n=args.length;
		Greeter g[]=new Greeter[n];
		for(int i=0;i<n;i++)
		{
			g[i]=new Greeter(args[i]);
			g[i].sayHello();
		}
		Advisor a = new Advisor();
		a.getAdvice();	
		for(int i=n-1;i>=0;i--)
		{
			g[i]=new Greeter(args[i]);
			g[i].sayGoodBye();
		}
	}
}