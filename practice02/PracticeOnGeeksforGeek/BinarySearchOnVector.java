package practice02.PracticeOnGeeksforGeek;
import java.util.*;
public class BinarySearchOnVector {
    public static void main(String[] args)
    {// Initialising a vector
        Vector<Integer> v=new Vector<Integer>();
        // Adding values to a vector
        v.add(-10);
        v.add(40);
        v.add(25);
        v.add(15);
        v.add(50);
        //sorting the vector bez binary search work on sorted array only
        Collections.sort(v);
        //searching the element
         int index=Collections.binarySearch(v,100);
         //printing the element
         System.out.print(" The Element is found at an index: "+ index);

    }
        
}
