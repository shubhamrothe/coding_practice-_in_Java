package practice02.String;

import static java.lang.System.out;
import java.util.*;
public class reverseString_3 {
public static void main(String[] args) {   

	Scanner sc=new Scanner(System.in);
    out.println("Enter a string");
	String str1=sc.next();
    char[] ch1=str1.toCharArray();
	int i;
	 char t;
	int l=ch1.length;
	for(i=0;i<l/2;i++)
	{
		t=ch1[i];
		ch1[i]=ch1[l-1-i];
		ch1[l-1-i]=t;
	}
	String str2=String.valueOf(ch1);
	out.print(str2);
    
  }
}
