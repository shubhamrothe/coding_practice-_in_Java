import static java.lang.System.out;
import java.util.*;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for input 0
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Prepend the remainder to the binary string
            decimal /= 2; // Divide the decimal by 2
        }
        int l=binary.toString().length();
        out.println("Length ="+l);
        return binary.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out.println("Enter a decimal number");
        int decimalNumber = sc.nextInt(); // Example input

        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryRepresentation);
        
    }
}
