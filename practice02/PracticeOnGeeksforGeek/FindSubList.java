package practice02.PracticeOnGeeksforGeek;
import java.util.*;
public class FindSubList {
    public static void main(String[] args)
    {
        try{
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original Arraylist: "+list);
       
        List<Integer> list2=list.subList(2,6);
        System.out.print("sublist of list: "+list2);

        List<Integer> list3=list.subList(2,5);
        System.out.print("sublist of list: "+list3);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(IllegalArgumentException e1)
        {
            System.out.println(e1);
        }

    }
}
