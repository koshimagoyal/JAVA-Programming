import java.util.Random;
abstract class Compartment{
	abstract void notice();
}
class FirstClass extends Compartment{
	void notice()
	{
		System.out.println("Reserved for first class");
	}
}
class Ladies extends Compartment{
	void notice()
	{
		System.out.println("Reserved for ladies only");
	}
}
class General extends Compartment{
	void notice()
	{
		System.out.println("Reserved for general only");
	}
}
class Luggage extends Compartment{
	void notice()
	{
		System.out.println("Reserved for luggage only");
	}
}
class TestCompartment{
	public static void main(String args[])
	{
		Compartment c[] = new Compartment[10];
		Random rd = new Random(); 
		int num=0;
		for(int i=0;i<10;i++)
		{
			num=rd.nextInt(4);
			if(num==0)
				c[i]=new FirstClass();
			else if(num==1)
				c[i]=new Ladies();
			else if(num==2)
				c[i]=new General();
			else
				c[i]=new Luggage();
			c[i].notice();
		}
	}
}