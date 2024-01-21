/*Q3.	Accept a year from user check if it is leap year or not*/

import java.util.*;
public class Que3 
{
    public static void main(String[] args)
    {
       int y;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the year");
       y=sc.nextInt();
       sc.close();
       if(y%4==0 && y%100!=0 || y%400==0)
       System.out.println("Enter the year is a leap year");
       else
       System.out.println("Enter the year is not a leap year");
    } 
}
