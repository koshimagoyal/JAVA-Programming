
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {

    int emp_no;
    String emp_name;
    Date d1;
    Employee(int no,String name,Date d1)
    {
        this.emp_no = no;
        this.emp_name = name;
        this.d1 = d1;
    }
    void getter()
    {
        System.out.println("Employee Number = "+emp_no);
        System.out.println("Employee Name = "+emp_name);
        d1.getter();
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of records you want to enter");
        int n = Integer.parseInt(br.readLine());
        Employee e[] = new Employee[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter the employee number");
            int no = Integer.parseInt(br.readLine());
            System.out.println("enter the employee name");
            String name = br.readLine();
            System.out.println("enter the date");
            int d = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            Date d1 = new Date(d, m, y);
            if (d1.validate()) {
                e[i] = new Employee(no, name, d1);
            } else {
                System.out.println("enter the date again");
                d = Integer.parseInt(br.readLine());
                m = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                d1 = new Date(d, m, y);
                if (d1.validate()) {
                    e[i] = new Employee(no, name, d1);
                }
            }
        }
        System.out.println("employee details");
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee "+i);
            e[i].getter();
        }
    }
}

