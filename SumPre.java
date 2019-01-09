class SumPre {
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print(a+" "+b);
        for (int i=2;i<17;i++)
        {
            int t=a+b;
            System.out.print(" "+t);
            a=b;
            b=t;
        }
    }
}
