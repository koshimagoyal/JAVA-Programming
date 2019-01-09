class Prime
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int flag=0;
	for(int i=1;i<=a;i++)
	{
		flag=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				flag++;
		}
		if(flag==2)
			System.out.println(i);
	}
	}
}