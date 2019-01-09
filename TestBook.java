import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBook {

    Book[] b = new Book[50];
    void createBooks(int n) throws IOException
    {
        for(int i=0;i<n;i++)
        {
            b[i] = new Book();
            b[i].getter();
        }

    }
    void showBooks(int n)
    {
        System.out.printf("  Book Title");
        System.out.printf("%28s","Price");
        System.out.println();
        for (int i=0;i<n;i++)
        {
            System.out.printf(b[i].book_title);
            System.out.printf("%25s","Rs."+b[i].book_price);
            System.out.println();
        }
    }
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of books you want to enter");
        int n = Integer.parseInt(br.readLine());
        TestBook t = new TestBook();
        t.createBooks(n);
        System.out.println("enter the number of books you want to print");
        n = Integer.parseInt(br.readLine());
        t.showBooks(n);
    }
}
