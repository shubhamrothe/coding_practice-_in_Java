
//this code correct but dont know how complier shows error
//it will run perfectly on online compiler
package practice02.PracticeOnGeeksforGeek;
import java.util.LinkedList;
import java.io.*;
public class getElementsOfLinkedList 
{
    public static void main(String[] args)
    {
        LinkedList <String> list = new LinkedList <String>();
        list.add("Shubham");
        list.add("Gajanan");
        list.add("Rothe");

    for(int i=0; i< list.size(); i++)
    {
        System.out.println("The element at "+ i + " th index is "+list.get(i));
    }
    }
    
}
