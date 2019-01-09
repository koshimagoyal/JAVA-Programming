
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestRectangle {

    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rectangle 1");
        Rectangle r = new Rectangle();
        r.display();
        r.area();
        System.out.println("Rectangle 2");
        Rectangle r2 = new Rectangle(20,10);
        r2.display();
        r2.area();
        System.out.println("Rectangle 3");
        Rectangle r3 = new Rectangle(30,45);
        r3.display();
        r3.area();
        System.out.println("Enter length of Rectangle 4");
        int l = Integer.parseInt(br.readLine());
        System.out.println("Enter breadth of Rectangle 4");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Rectangle 4");
        Rectangle r4 = new Rectangle(l,b);
        r4.display();
        r4.area();
        System.out.println("Enter length of Rectangle 5");
        l = Integer.parseInt(br.readLine());
        System.out.println("Enter breadth of Rectangle 5");
        b = Integer.parseInt(br.readLine());
        System.out.println("Rectangle 5");
        Rectangle r5 = new Rectangle(l,b);
        r5.display();
        r5.area();
    }
}
