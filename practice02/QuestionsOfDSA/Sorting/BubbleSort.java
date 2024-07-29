package practice02.QuestionsOfDSA.Sorting;
import java.util.*;
import static java.lang.System.out;
public class BubbleSort 
{//Array creation
    int[] a;
    void createArray(int n)
    {
        a=new int[n];
        Scanner sc=new Scanner(System.in);
        out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
    }
    //bubble sorting
    void bubbleSort()
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                int t;
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    //modified way
    void BubbleSort()
    {
        int done=1;
        for(int i=a.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                int t;
                if(a[j]<a[j+1])
                {
                    done=0;
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                if(done==1)
                break;
            }
        }
    }
    //print array
    void printArray()
    {
        out.println("The sorted array is ");
        for(int i=0;i<a.length;i++)
        {
            out.println(a[i]);
        }
    }
    public static void main(String[] args)
    {
        BubbleSort ob=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        ob.createArray(n);
        ob.bubbleSort();
      //  ob.BubbleSort();
        ob.printArray();
        sc.close();
    }
}
