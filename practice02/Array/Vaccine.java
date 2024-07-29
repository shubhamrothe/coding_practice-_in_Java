/**
 * A new deadly virus has infected large population of a planet. A brilliant scientist has discovered a new strain of virus which can cure this disease. Vaccine produced from this virus has various strength depending on midichlorians count. A person is cured only if midichlorians count in vaccine batch is more than midichlorians count of person. A doctor receives a new set of report which contains midichlorians count of each infected patient, Practo stores all vaccine doctor has and their midichlorians count. You need to determine if doctor can save all patients with the vaccines he has. The number of vaccines and patients are equal.

Input Format

First line contains the number of vaccines - N. Second line contains N integers, which are strength of vaccines. Third line contains N integers, which are midichlorians count of patients.

Output Format

Print a single line containing 
Yes or No 
.
 */

package practice02.Array;
import java.util.*;
import static java.lang.System.out;
public class Vaccine 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter no.of Vaccines availables");
        int N=sc.nextInt();
        out.println("Enter the strenth of each vaccine");
        int[] strengthOfVaccines =new int[N];
        out.println("Enter the midichlorians Count of each person");
        int[] midichloriansCount =new int[N];

        for(int i=0;i<N;i++)
        {
            strengthOfVaccines[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            midichloriansCount[i]=sc.nextInt();
        }

        Arrays.sort(strengthOfVaccines);
        Arrays.sort(midichloriansCount);
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(strengthOfVaccines[i] < midichloriansCount[i])
            {
                count++;
                break;
            }
        }
        if(count==0)
        out.print("Yes");
        else
        out.print("No");
    }
    
}
