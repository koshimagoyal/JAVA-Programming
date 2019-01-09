abstract class Instrument{

	abstract void play();
}
class Piano extends Instrument{
	void play()
	{
		System.out.println("piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	void play()
	{
		System.out.println("flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	void play()
	{
		System.out.println("guitar is playing tin tin tin");
	}
}
class Testt{
	public static void main(String args[])
	{
		Instrument in[]=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			if(i==1||i==5||i==9)
				in[i]=new Piano();
			else if(i==3||i==4||i==7)
				in[i]=new Flute();
			else
				in[i]=new Guitar();
			in[i].play();
			if(in[i] instanceof Piano)
				System.out.println("instance of piano");
			if(in[i] instanceof Flute)
				System.out.println("instance of flute");
			if(in[i] instanceof Guitar)
				System.out.println("instance of guitar");
		}
	}
}
