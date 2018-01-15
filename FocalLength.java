import java.util.*;
public class FocalLength
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
				String s3 = in.nextLine();
				float r = in.nextFloat();
				if(r>=1&&r<=100)
				{
					if(s3.equalsIgnoreCase("convex"))
						System.out.println((int)Math.floor(-r/2));
					else
						System.out.println((int)Math.floor(r/2));
					
				}
			}
		}
	}
}