package igit.roll.shape;
public class Square extends Polygon{
	float side;
	public Square(float s)
	{
		side=s;
	}
	public void calcArea()
	{
		area = side * side;
	}
	public void calcPeri()
	{
		perimeter = 4*side;
	}
	public void display()
	{
		System.out.println("Area = "+area);
		System.out.println("Perimeter ="+perimeter);
	}
}