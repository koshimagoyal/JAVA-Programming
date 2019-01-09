import igit.roll.shape.Square;
import igit.roll.shape.Rectangle;
class DiffPac{
	public static void main(String args[])
	{
		Square s = new Square(2.1f);
		s.calcArea();
		s.calcPeri();
		s.display();
		Rectangle r = new Rectangle(1.2f,1.3f);
		r.calcArea();
		r.calcPeri();
		r.display();
	}
}