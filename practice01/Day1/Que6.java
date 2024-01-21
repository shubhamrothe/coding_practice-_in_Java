/*Q6.	Accept a marks from user and print it’s grade
a.	Mks>=75  grade A
b.	Mks>=55 grade B
c.	Mks>=35 grade c
d.	Else fail
*/
//import java.lang.*;
import java.util.*;
public class Que6 
{
    public static void main(String[] args)
    {
    int m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks");
    m=sc.nextInt(); 
    sc.close();
    if(m>=35 && m<55)
    System.out.println("Grade C");
    else if(m>=55 && m<75)
    System.out.println("Grade B");
    else if(m>=75 && m<=100)
    System.out.println("Grade A");
    else
    System.out.println("Fail");
    }   
}


/*
 * public class Demo01 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the marks");
        int m=sc.nextInt();
        if(m>=0&&m<=100)
        {
        if(m>=75)
        out.println("Grade: A");
        else if(m>=55)
        out.println("Grade: B");
        else if(m>=35)
        out.println("Grade: C");
        else
        out.println("Fail");
        }
        else
        out.println("Please,enter valid marks");

    }
    
}
 */