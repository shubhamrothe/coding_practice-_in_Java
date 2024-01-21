/* Write a program to check tpe of triangle*/

import java.util.*;
public class Que14 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  three sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt(); 
        sc.close();
        if(a*a+b*b==c*c || a*a+c*c==b*b||c*c+b*b==a*a)
        System.out.println("A triangle is right-angled trianle");
        else if(a==b||b==c||c==a)
        System.out.println("A triangle is isosceles trianle");
        else if(a==b&&b==c&&c==a)
        System.out.println("A triangle is equiateral trianle");
        else if(a+b>c&&b+c>a&&a+c>b)
        System.out.println("the three values are diamensins of triangle");
        else
        System.out.println("Invalid triangle");
    }
}
