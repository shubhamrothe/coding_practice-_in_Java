package practice02.PracticeOnGeeksforGeek;
import java.util.*;

public class CompareElementsOfCollection {
    public static void main(String[] args)
    {
        ArrayList <Integer> list=new ArrayList<Integer>();
        list.add(4);
        list.add(9);
        list.add(5);
        list.add(10);
        list.add(2);
        int Minimum=Collections.min(list);
        int Maximum=Collections.max(list);
        if(Minimum==Maximum)
        System.out.println("Elements are same");
        else{
            System.out.println("The minimum element is " +Minimum);
            System.out.println("The maximum element is " +Maximum);
        }
    }
}
