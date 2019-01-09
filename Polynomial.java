
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Polynomial {

    Term t[]=new Term[5];
    int n,k;
    Polynomial(int n,int k)
    {
        this.n = n;
        this.k=k;
        if(this.k>3)
            System.out.println("size of term should be less than or equal to 3");
        else{
            for(int i=0;i<this.k;i++)
                t[i] = new Term();
        }
    }
    void setTerm(int c,int e)
    {
        if(e<0)
            System.out.println("Exponent is negative");
        else{

                /*if(t[i].exponent==t[--i].exponent)
                    System.out.println("Exponent is used");
                else*/
                    t[i].set(c,e);
            }
    }
    void display()
    {
        for(int i=0;i<this.k;i++)
        {
            if(i>0&&t[i].coefficient>0)
                System.out.print("+"+t[i].coefficient+"x"+t[i].exponent);
            else
                System.out.print(t[i].coefficient+"x"+t[i].exponent);
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of polynomials you want to create");
        int n = Integer.parseInt(br.readLine());
        Polynomial p[] = new Polynomial[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter size of term");
            int k = Integer.parseInt(br.readLine());
            p[i] = new Polynomial(n,k);
            for(int j=0;j<k;j++) {
                System.out.println("enter the coefficient");
                int c = Integer.parseInt(br.readLine());
                System.out.println("enter the exponent");
                int e = Integer.parseInt(br.readLine());
                p[i].setTerm(c, e);
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("Polynomial "+i);
            p[i].display();
        }
    }
}
