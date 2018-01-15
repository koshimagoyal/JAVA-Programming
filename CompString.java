import java.util.*;
public class CompString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		if(T>=1&&T<=100)
		{
			for(int i=1;i<=T;i++)
			{
				int w1=0,w2=0;
				String s2 = in.nextLine();
				String s3 = in.nextLine();
				for(int j=0;j<s2.length();j++)
				{
					char c = s2.charAt(j);
					int n = (int)c;
					int p = n-96;
					w1+=p;
				}
				System.out.println(w1);
				for(int j=0;j<s3.length();j++)
				{
					char c = s3.charAt(j);
					int n = (int)c;
					int p = n-96;
					w2+=p;
				}
				System.out.println(w2);
				if(w1>w2)
					System.out.println("1");
				else if(w1<w2)
					System.out.println("2");
				else
					System.out.println("equals");
			}
		}
	}
}