package igit.roll.shape;
public class Rectangle extends Polygon{
	float length,breadth;
	public Rectangle(float len,float bre)
	{
		length=len;
		breadth=bre;
	}
	public void calcArea()
	{
		area = length * breadth;
	}
	public void calcPeri()
	{
		perimeter = 2*(length+breadth);
	}
	public void display()
	{
		System.out.println("Area = "+area);
		System.out.println("Perimeter ="+perimeter);
	}
}