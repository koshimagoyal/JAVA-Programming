import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRectangle1 {

    public static void main(String[]args) throws IOException
    {
        Rectangle1 r = new Rectangle1();
        if(r.set())
        {
            r.area();
            r.perimeter();
            r.get();
        }
        else
        {
            System.out.println(" Length should be larger than 0.0 and breadth should be lesser than 20.0");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length");
        float l = Float.parseFloat(br.readLine());
        System.out.println("enter the breadth");
        float b = Float.parseFloat(br.readLine());
        Rectangle1 r1 = new Rectangle1(l,b);
        if(r1.set())
        {
            r1.area();
            r1.perimeter();
            r1.get();
        }
        else
        {
            System.out.println("Length should be larger than 0.0 and breadth should be lesser than 20.0");
        }
    }
}
