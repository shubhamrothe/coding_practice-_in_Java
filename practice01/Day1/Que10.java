import java.util.*;
public class Que10
{
    public static void main(String[]   args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sex and salary");
        char ch=sc.next().charAt(0);
        double salary=sc.nextDouble();
        sc.close();
        double tax,netsalary;
        if(salary>8000&&(ch=='m'||ch=='M'))
              tax=0.05; 
        else if(salary<8000&&(ch=='m'||ch=='M'))
                tax=.02;
        else if(salary>5000&&(ch=='f'||ch=='F'))
            tax=.03;
        else
                tax=.01;
         netsalary=salary-salary*tax;
         System.out.println(netsalary);
    }
    
}
