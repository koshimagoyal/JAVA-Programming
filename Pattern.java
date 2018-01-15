import java.util.*;
public class Pattern
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if(T>=1&&T<=100)
		{
			for(int i=1;i<=T;i++)
			{
				int n = in.nextInt();
				if(n>=1&&n<=1000)
				{
					int nth=0;
					for(int j=1;j<=n;j++)
						nth=(j*j)-nth;
					System.out.println(nth);
				}
			}
		}
	}
}