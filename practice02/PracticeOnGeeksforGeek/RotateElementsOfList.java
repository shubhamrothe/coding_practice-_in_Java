package practice02.PracticeOnGeeksforGeek;
import java.util.*;
public class RotateElementsOfList {
    public static void main(String[] args)
    {
        List< Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        // Printing list before rotation 
        System.out.println("List Before Rotation : "+ Arrays.toString(list.toArray()));
        //rotate list to right by 4 elements
        Collections.rotate(list, 10);
        // Printing list after right rotation 
        System.out.println("List after right Rotation by 4 elements : "+ Arrays.toString(list.toArray()));
        //rotate list to left by 4 elements
        Collections.rotate(list, -4);
          // Printing list after left rotation
          System.out.println("List after left Rotation by 4 elements : "+ Arrays.toString(list.toArray()));
    }
    
}
