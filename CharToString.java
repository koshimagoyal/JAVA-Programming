import java.util.Scanner;
public class CharToString
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
				char[] c = new char[N];
				for(int j=0;j<N;j++)
				{
					c[j]=in.next().charAt(0);
				}
				String str = new String(c);
				System.out.println(str);
			}
		}
	}
}