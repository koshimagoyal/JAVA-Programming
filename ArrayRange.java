public class ArrayRange {

    public static void main(String[] args) 
    {
        int a[] = {7,25,5,19,30};
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int flag=0;
        System.out.println("Your first number was "+b);
        System.out.println("Your second number was "+c);
        for(int i=0;i<5;i++)
        {
            if(a[i]==b)
                flag++;
            if(a[i]==c)
                flag++;
        }
        if(flag==2)
            System.out.println("Its BINGO!");
        else {
            System.out.println("Not Found!");
            System.out.print("The array was");
            for (int i = 0; i < 5; i++)
                System.out.print(" " + a[i]);
        }
    }
}
