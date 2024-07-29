//program to print collection in java

// Approach 1: Printing a user-defined ArrayList

// package practice02.PracticeOnGeeksforGeek;
// import java.util.*;
// public class PC {
//     String name;
//     int rollno;
//     //constructor of collection class
//     PC(String s,int n)
//     {
//         name=s;
//         rollno=n;
//     }
//      // over-riding the toString method to print the collection
//     public String toString()
//     {
//         return "Name: " + name +",RollNo: "+ rollno; 
//     }
//     public static void main(String[] args)
//     {   // creating an arraylist of user-defined collection
//         ArrayList<PC> list=new ArrayList<PC>();
//         // creating objects of class PC
//         PC t1=new PC("Shubham",1);
//         PC t2=new PC("Ashish",2);
//         PC t3=new PC("Rishab",3);
//         PC t4=new PC("Mahesh",4);
//          // adding objects to arraylist
//         list.add(t1);
//         list.add(t2);
//         list.add(t3);
//         list.add(t4);
//         //printing the arraylist
//         for(PC l : list)
//         System.out.println(l);
//     }
    
// }



//Approach 2: Printing a user-defined HashMap
package practice02.PracticeOnGeeksforGeek;
import java.util.*;
public class PC {
    String name;
    int rollno;
    //constructor of collection class
    PC(String s,int n)
    {
        name=s;
        rollno=n;
    }
     // over-riding the toString method to print the collection
    public String toString()
    {
        return "Name: " + name +",RollNo: "+ rollno; 
    }
    public static void main(String[] args)
    {   // creating an arraylist of user-defined collection
        HashMap<Integer,PC> hm=new HashMap<Integer,PC>();
        // creating objects of class PC
        PC t1=new PC("Shubham",1);
        PC t2=new PC("Ashish",2);
        PC t3=new PC("Rishabh",3);
        PC t4=new PC("Mahesh",4);

        hm.put(1,t1);
        hm.put(2,t2);
        hm.put(3,t3);
        hm.put(4,t4);

        for(Map.Entry m : hm.entrySet())
        System.out.println(m.getKey() + " " + m.getValue().toString());
    }
}
