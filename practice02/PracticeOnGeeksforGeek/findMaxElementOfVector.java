package practice02.PracticeOnGeeksforGeek;
import java.util.Vector;
import java.util.Collections;

// public class findMaxElementOfVector {
//     public static void main(String[] args)
//     {// Initialising a vector
//         Vector<Integer> v=new Vector<Integer>();
//         // Adding values to a vector
//         v.add(1);
//         v.add(2);
//         v.add(3);
//         v.add(4);
//         v.add(5);
//         // Finding a maximum element
//         int n = Collections.max(v);
//         // Printing a maximum element
//         System.out.print("Maximum element in vector is: "+ n);
//     }
// }

//OR
import java.util.*;
public class findMaxElementOfVector {
    public static void main(String[] args)
    {// Initialising a vector
        Vector<Integer> v=new Vector<Integer>();
        // Adding values to a vector
        v.add(-1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        
        int MaxNo=Integer.MIN_VALUE;
        Iterator itr= v.iterator();
        while(itr.hasNext())
        {
            int element = (Integer)itr.next();
            if(MaxNo < element)
            {
                MaxNo=element;
            }
        }
        // Printing a maximum element
        System.out.print("Maximum element in vector is: "+ MaxNo);
    }
}

