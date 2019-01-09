
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Book {
    String book_title;
    float book_price;
    void getter() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the book title");
        String bt = br.readLine();
        System.out.println("Enter the book price");
        float bp = Float.parseFloat(br.readLine());
        setter(bt,bp);
    }
    void setter(String book_title,float book_price)
    {
        this.book_title = book_title;
        this.book_price = book_price;
    }

}
