//x and y are two numbers .write program to find out if y is power of x.
import static java.lang.System.out;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      out.print("Enter the value of x ");
        int x = sc.nextInt();
        
        out.print("Enter the value of y ");
        int y = sc.nextInt();
        
        if (isPower(x, y)) {
            out.println(y + " is a power of " + x);
        } else {
        out.println(y + " is not a power of " + x);
        }
    }
    
    public static boolean isPower(int x, int y) {
        if (y == 1) {
            return true; 
        }
        int power = 1;
        while (power < y) {
            power *= x;
        }
        return power == y;
    }
}



