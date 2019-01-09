import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeB {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        String p = br.readLine();
        int a = Integer.parseInt(p);
        int flag=0;
        for(int i=1;i<=a;i++)
	{
		flag=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				flag++;
		}
		if(flag==2)
			System.out.println(i);
	}
    }
}
