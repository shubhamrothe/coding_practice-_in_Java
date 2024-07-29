/*Swap two variale  */
import java.util.*;
import static java.lang.System.out;
public class Que1 
{
    public static void main (String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
                // Case:1
        /*a=a+b;
        b=a-b;
        a=a-b;
        */

             // Case:2
        /*a=a*b;
        b=a/b;
        a=a/b;*/

                 // Case:3
        /*int t;
        t=a;
        a=b;
        b=t;*/
                 // Case:4
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"\n"+b);

    }

    // public class WrapperExample {
    //     public static void main(String[] args) {
    //         int primitiveInt = 42;
    //         Integer objectInt = Integer.valueOf(primitiveInt); // Wrapping
            
    //         int unwrappedInt = objectInt.intValue(); // Unwrapping
    //         System.out.println("Primitive: " + primitiveInt);
    //         System.out.println("Object: " + objectInt);
    //         System.out.println("Unwrapped: " + unwrappedInt);
    //     }
    // }
}
