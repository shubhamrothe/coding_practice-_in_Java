
import java.util.*;

public class DecimalToREverseBinary {

    public static String decimalToReverseBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for input 0
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder); // Append the remainder to the binary string
            decimal /= 2; // Divide the decimal by 2
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimalNumber = sc.nextInt(); // Example input

        String reverseBinaryRepresentation = decimalToReverseBinary(decimalNumber);
        System.out.println(" Reverse Binary representation: " + reverseBinaryRepresentation);
    }
}
