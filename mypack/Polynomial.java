class Polynomial{
	Term [] t=new Term[3];
	static int l=0;
	int k;
	Polynomial(int k)
	{
		this.k=k;
		if(k>3)
			System.out.println("size is more for quadratic equation");
		else
		{
			for(int i=0;i<this.k;i++)
				t[i]=new Term();
		}
	}
	void check()
	{
		if(l==k)
			l=0;
	}
	boolean setTerm(int c,int e)
	{
		for(int i=0;i<l;i++)
			if(t[i].exp==e)
				return false;
		#System.out.println("l="+l);
		t[l]=new Term(c,e);
		l++;
		return true;
	}
	void show()
	{
		for(int i=0;i<k;i++)
		{
			if(i%2==0)
				System.out.print(t[i].coeff+"x"+t[i].exp);
			else
				System.out.print("+"+t[i].coeff+"x"+t[i].exp+"+");					
		}
	}
}