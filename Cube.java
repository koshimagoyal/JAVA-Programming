import java.util.*;
public class Cube
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		if(T>=1&&T<=100)
		{
			for(int i=1;i<=T;i++)
			{
				int N = in.nextInt();
				if(N>=1&&N<=6)
				{
					int q=7-N;
					System.out.println(q);
				}
			}
		}
	}
}