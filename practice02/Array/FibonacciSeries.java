package practice02.Array;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 1;
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series for the first " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}