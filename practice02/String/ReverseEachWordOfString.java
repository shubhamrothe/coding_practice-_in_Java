//write a code to retverse each word of string 

package practice02.String;

import static java.lang.System.out;
public class ReverseEachWordOfString  
{
    public static void main(String[] args) {
        String str = "Hello , World!";
        String[] ss = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ss.length; i++) {
            String str1 = "";
            for (int j = ss[i].length() - 1; j >= 0; j--) {
                str1 = str1 + ss[i].charAt(j);
            }
            sb.append(str1);
            if (i < ss.length - 1) {
                sb.append(" ");
            }
        }
        out.print(sb);
    }
}
