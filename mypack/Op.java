class Op
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String op = args[2];
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("op="+op);
		if(op.equals("+"))
			System.out.println("Addition = "+(a+b));
		if(op.equals("-"))
			System.out.println("Subtraction ="+(a-b));
		if(op.equals("x"))
			System.out.println("Multiplication ="+(a*b));
		if(op.equals("/"))
			System.out.println("Division ="+(a/b));
	}
}