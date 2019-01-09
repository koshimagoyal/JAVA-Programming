class Factorial{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int j=1,i;
		for(i=2;i<=n;i++)
		{
			if(j!=n)
				j=j*i;
			else
				break;
		}
		if(j==n)
			System.out.println("Factorial of "+n+" is "+(--i));
		else
			System.out.println("Not factorial");
	}
}