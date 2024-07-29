package practice02.String;
import java.util.Scanner;

public class PrintMisingChars_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start character: ");
        char start = scanner.nextLine().charAt(0);

        System.out.print("Enter the end character: ");
        char end = scanner.nextLine().charAt(0);

        if (start > end) {
            System.out.println("Invalid range: Start character should be less than or equal to end character.");
            scanner.close();
            return;
        }

        System.out.print("Enter characters between " + start + " and " + end + ": ");
        String enteredCharacters = scanner.nextLine();

        StringBuilder missingCharacters = new StringBuilder();

        for (char c = start; c <= end; c++) {
            if (enteredCharacters.indexOf(c) == -1) {
                missingCharacters.append(c);
            }
        }

        System.out.println("Missing characters: " + missingCharacters.toString());

        scanner.close();
    }
}
