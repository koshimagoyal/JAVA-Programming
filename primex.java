import java.util.*;
class PrimeC {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
	System.out.println("prime no are");
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
