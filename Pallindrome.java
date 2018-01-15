import java.io.*;
import java.lang.*;
import java.util.*;
public class Pallindrome
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s2 = s3.reverse();
		if(s3.equals(s2))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}
}