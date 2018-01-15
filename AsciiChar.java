public class AsciiChar
{
	public static void main(String[] args)
	{
		Integer T = Integer.parseInt(args[0]);
		if(T>=1&&T<=100)
		{
			int j=1;
			for(int i=1;i<=T;i++)
			{
				char c = args[j].charAt(0);
				int n = (int)c;
				j++;
				System.out.println(n);
			}
		}
	}
}