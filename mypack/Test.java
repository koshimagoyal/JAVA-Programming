import java.io.*;

class Test{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("no of polynomials");
		int n = Integer.parseInt(br.readLine());
		Polynomial p[]=new Polynomial[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("no of terms");
			int k = Integer.parseInt(br.readLine());
			p[i]=new Polynomial(k);
			for(int j=0;j<k;j++)
			{
				System.out.println("enter coeff");
				int c = Integer.parseInt(br.readLine());
				System.out.println("enter exponent");
				int e = Integer.parseInt(br.readLine());
				if(e<0)
				{
					System.out.println("enter exponent greater than 0");
					e = Integer.parseInt(br.readLine());
				}
				else
				{
					if(p[i].setTerm(c,e)==false)
					{
						System.out.println("exponent already used. enter new");
						e = Integer.parseInt(br.readLine());
						p[i].setTerm(c,e);
					}
					else
						p[i].check();
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			p[i].show();
			System.out.println();
		}
	}
}