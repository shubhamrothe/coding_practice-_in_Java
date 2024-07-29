package practice02.Array;
import  java.util.Scanner; 
import  java.util.ArrayList;

public class stringIsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean status = isAnagram(str1, str2);

        if (status) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
    }
}
