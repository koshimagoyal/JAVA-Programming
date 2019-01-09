class CalcAverage{
	public double avgFirst(int n){
		double sum=0.0;
		if(n<1)
			throw new IllegalArgumentException ("demo");
		else
		{
			for(int i=0;i<=n;i++)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String args[])
	{
		CalcAverage c = new CalcAverage();
		try{
			System.out.println("the sum is "+c.avgFirst(3));
			System.out.println("the sum is "+c.avgFirst(-3));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("The n is not natural number "+e);
		} 
	}

}