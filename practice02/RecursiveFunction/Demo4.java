package practice02.RecursiveFunction;
import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        if (number < 10) {
            return number; 
        } else {

            int lastDigit = number % 10;
            int remainingDigits = number / 10;
            return lastDigit + calculateSumOfDigits(remainingDigits);
        }
    }

}
