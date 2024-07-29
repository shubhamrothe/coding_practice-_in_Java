package practice02.RecursiveFunction;
import static java.lang.System.out;
public class Demo2 
{
    public static void main(String[] args) 
    {
        int no = 25;
        String binary = Binary(no);
        System.out.println("Binary representation of " + no + " is: " + binary);
    }

    public static String Binary(int n) 
    {
        if (n == 0) {
            return "0"; 
        } else if (n == 1) {
            return "1"; 
        } else {
            return Binary(n / 2) + (n % 2);
        }
    }
    
}
