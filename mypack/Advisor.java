package igit.rollno.name;
import java.util.Random;
class Advisor{
	String[] message = new String[5];
	Advisor()
	{
		for(int i=0;i<5;i++)
		{
			message[i]=new String();
		}
		message[0]="Never say No!";
		message[1]="Dont spit in public";
		message[2]="Work hard";
		message[3]="Always smile";
		message[4]="Meditation is good for health";
	}
	void getAdvice()
	{
		Random rd=new Random();
		int num=rd.nextInt(5);
		System.out.println("Advice:"+message[num]);
	}
}