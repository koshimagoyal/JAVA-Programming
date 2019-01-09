import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rectangle1 {
    float length;
    float breadth;
    Rectangle1()
    {
        length=1;
        breadth=1;
    }
    Rectangle1(float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void get()
    {
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Area = "+area());
        System.out.println("Perimeter = "+perimeter());
    }
    boolean set()
    {
        if(length>0.0&&breadth<20.0)
            return true;
        else
            return false;

    }
    float area()
    {
        return length*breadth;
    }
    float perimeter()
    {
        return 2*(length+breadth);
    }
}
