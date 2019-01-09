class Car{
	int speed;
	int noOfGear;
	void drive()
	{
		speed=5;
		noOfGear=2;
	}
	void display()
	{
		System.out.println("Speed="+speed);
		System.out.println("No of Gear ="+noOfGear);
	}
}
class SportCar extends Car{
	void AirBalloonType()
	{
		super.display();
	}
	void display()
	{
		System.out.println("SportsCar");
	}
}
class TestCar{
	public static void main(String args[])
	{
		SportCar s = new SportCar();
		s.AirBalloonType();
		s.display();
	}
}