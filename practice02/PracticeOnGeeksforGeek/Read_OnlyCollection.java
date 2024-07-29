package practice02.PracticeOnGeeksforGeek;
import java.util.*;
public class Read_OnlyCollection 
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for(String l: list)
        System.out.print(l +" ");
        //System.out.println();
        list.remove("A");
        for(String l: list)
        System.out.print(l +" ");

        Collections.unmodifiableList(list);
        try{
           
            list.remove("B");
        }
        catch(UnsupportedOperationException e)
        {
            System.out.print("Exception occured is "+ e);
        }
        finally {
            System.out.println(list.get(1));
            System.out.println("Now list is only Read-Only");
        }
    }
    
}
