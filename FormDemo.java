import java.awt.*;
import java.applet.*;
public class FormDemo extends Applet
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Button b1,b2;
	CheckboxGroup g = null;
	Checkbox c1,c2;
	String msg;
	public void init()
	{

	l1=new Label();
	l2=new Label();
	l3=new Label();
	l4=new Label();
	l5=new Label();
	l6=new Label();
	l7=new Label();
	l8=new Label();
	l9=new Label();
	l1.setText("INDIRA GANDHI DELHI TECHNICAL UNIVERSITY FOR WOMEN");
	l1.setBounds(30,5,200,40);
	add(l1);
	l2.setText("STUDENT DETAIL FORM");
	l2.setBounds(200,200,600,20);
	add(l2);
	setLayout(new GridLayout(11,2,70,70));
	l3.setText("NAME:");
	l3.setBounds(9000,800,750,750);
	add(l3);
	l4.setText("ENROLLMENT NO:");
	l4.setBounds(9000,800,750,750);
	add(l4);
	t2 = new TextField(10);
	add(t2);
	l5.setText("ROLL NO:");
	l5.setBounds(9000,800,750,750);
	add(l5);
	t3 = new TextField(10);
	add(t3);
	l6.setText("COURSE:");
	l6.setBounds(9000,800,750,750);
	add(l6);
	g = new CheckboxGroup();
	c1 = new Checkbox("BTech",g,true);
	c2 = new Checkbox("MCA",g,false);
	add(c1);
	add(c2);
	l7.setText("SEMESTER:");
	l7.setBounds(9000,800,750,750);
	add(l7);
	t4 = new TextField(10);
	add(t4);
	l8.setText("ADDRESS:");
	l8.setBounds(9000,800,750,750);
	add(l8);
	t5 = new TextField(10);
	add(t5);
	t6 = new TextField(10);
	add(t6);
	l9.setText("CONTACT NO:");
	l9.setBounds(70,20,50,50);
	add(l9);
	t7 = new TextField(10);
	add(t7);
	b1 = new Button("SUBMIT");
	b2 = new Button("RESET");
	add(b1);
	add(b2);
	t1 = new TextField(10);
	add(t1);
	
	}
	public void paint(Graphics g)
	{
		g.drawString("Form Ready",200,200);
	}
}	

	