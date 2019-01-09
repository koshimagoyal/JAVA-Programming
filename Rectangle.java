class Rectangle {
    int length;
    int breadth;
    Rectangle()
    {
        this.length=0;
        this.breadth=0;
    }
    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void area()
    {
        System.out.println("Area = "+length*breadth);
    }
    void display()
    {
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
}
