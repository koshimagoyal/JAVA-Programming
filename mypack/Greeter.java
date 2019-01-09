package igit.rollno.name;
class Greeter{
	String name;
	Greeter(String name)
	{
		this.name=name;
	}
	void sayHello()
	{
		System.out.println("Hello,");
		System.out.println(name+"!");
	}
	void sayGoodBye()
	{
		System.out.println("GoodBye "+name);
	}
}