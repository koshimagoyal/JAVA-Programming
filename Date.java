
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Date {

    int d,m,y;
    Date()
    {
        d = 22;
        m = 1;
        y = 1997;
    }
    Date(int d,int m,int y)
    {
        this.d = d;
        this.m = m;
        this.y = y;
    }
    boolean validate()
    {
        int l=0,n=y;
        while (n>0)
        {
            n=n/10;
            l++;
        }
        if(m<1||m>12)
        {
            System.out.println("Wrong month");
            return false;
        }
        if(y%4==0||y%400==0)
        {
            if(m==2)
            {
                if(d<1||d>29)
                {
                    System.out.println("Day is incorrect");
                    return false;
                }
            }
        }
        else
        {
            if(m==2)
            {
                if(d<1||d>28)
                {
                    System.out.println("Day is incorrect");
                    return false;
                }
            }
        }
        if(m==4||m==6||m==9||m==11)
        {
            if(d<1||d>30)
            {
                System.out.println("Day is incorrect");
                return false;
            }
        }
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            if(d<1||d>31)
            {
                System.out.println("Day is incorrect");
                return false;
            }
        }
        if(l!=4)
        {
            System.out.println("Year is incorrect");
            return false;
        }
        return true;
    }
    void add(int n)
    {
        d+=n;
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
            if(d>31)
            {
                d=1;
                m++;
            }
        }
        if(m==4||m==6||m==9||m==11)
        {
            if(d>30)
            {
                d=1;
                m++;
            }
        }
        if(y%4==0||y%400==0)
        {
            if(m==2&&d>29)
            {
                d=1;
                m++;
            }
        }
        else
        {
            if(m==2&&d>28)
            {
                d=1;
                m++;
            }
        }
        if(m>12) {
            y++;
            m = 1;
        }
    }
    void getter()
    {
        System.out.println("Date = "+d+":"+m+":"+y);
    }

    public static void main(String[] args) throws IOException
    {
        Date d = new Date();
        if(d.validate())
            d.getter();
        Date d1 = new Date(35,16,19944);
        if(d1.validate())
            d1.getter();
        System.out.println("enter the date");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        Date d2 = new Date(l,m,y);
        if(d2.validate())
        {
            System.out.println("enter the no to add");
            int n = Integer.parseInt(br.readLine());
            d2.add(n);
            d2.getter();
        }
    }

}
