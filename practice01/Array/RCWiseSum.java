package Array;
import static java.lang.System.out;
import java.util.*;

public class RCWiseSum {
public static void main(String[] args) {   
	int i,j;

	Scanner sc=new Scanner(System.in);

	int []r=new int[3];
	int []c=new int[3];
	int sum;
	int[][] arr=new int[3][3];
	
	for(i=0;i<3;i++)

	{
		for(j=0;j<3;j++)
			arr[i][j]=sc.nextInt();
	}

//row wise sum
	for(i=0;i<3;i++)
	{sum=0; 
		for(j=0;j<3;j++)

			sum=sum+arr[i][j];
			r[i]=sum;

		out.println();
	}

	//column wise sum
	for(i=0;i<3;i++)
	{    sum=0;
		for(j=0;j<3;j++)
			sum=sum+arr[j][i];
			c[i]=sum;
		out.println();
	}
	//print row wise sum
	for(i=0;i<3;i++)
		out.println(r[i]);
   //print col. wise sum
	for(i=0;i<3;i++)
		out.println(c[i]);
}
}
