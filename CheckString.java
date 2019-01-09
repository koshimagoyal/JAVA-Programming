
class CheckString {

    public static void main(String[] args)
    {
        String s = args[0];
        System.out.println("Length = "+s.length());
        System.out.println("UpperCase = "+s.toUpperCase());
        String s1 = "";
        for (int i=s.length()-1;i>=0;i--)
        {
            s1 += s.charAt(i);
        }
        if(s.equals(s1))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
