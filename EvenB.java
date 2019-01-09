import java.io.*;
class EvenB {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
	String p = br.readLine();
        int a = Integer.parseInt(p);
        if(a%2==0)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
    }
}
