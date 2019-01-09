import java.util.Random;
class Medicine{
	String name,address;
	void  displayLabel()
	{
		System.out.println("Name = "+name);
		System.out.println("Address = "+address);
	}
}
class Tablet extends Medicine{
	Tablet(String n,String a)
	{
		super.name=n;
		super.address=a;
	}
	void displayLabel()
	{
		super.displayLabel();
		System.out.println("Store in cool dry place");
	}
}
class Syrup extends Medicine{
	Syrup(String n,String a)
	{
		super.name=n;
		super.address=a;
	}
	void displayLabel()
	{
		super.displayLabel();
		System.out.println("For external use only");
	}
}
class Ointment extends Medicine{
	Ointment(String n,String a)
	{
		super.name=n;
		super.address=a;
	}
	void displayLabel()
	{
		super.displayLabel();
		System.out.println("Keep away from children");
	}
}
class TestMedicine{
	public static void main(String args[])
	{
		Medicine m[]=new Medicine[10];
		Random rd = new Random();
		int num=0;
		for(int i=0;i<10;i++)
		{
			num=rd.nextInt(3);
			if(num==0)
				m[i] = new Tablet("tablet","delhi");
			else if(num==1)
				m[i]=new Syrup("syrup","gujarat");
			else 
				m[i]=new Ointment("oint","delhi");
			m[i].displayLabel();
		}
	}
}