package practice02.String;

import static java.lang.System.out;
import java.util.*;

public class PalindromeString_2 {
public static void main(String[] args) {   

	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	char[] ch1=str1.toCharArray();
	int l=ch1.length;
	int i,flag=0;
	sc.close();
	for(i=0;i<l/2;i++)
	{
		if(ch1[i]!=ch1[l-1-i])
		{ flag=1;
			break;
		}
	}
	if(flag==1)
	out.print("not a palindrome");
	else
		out.print("palindrome string");
 
  }
}