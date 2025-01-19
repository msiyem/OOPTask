package PracticeProblem03contd;

public class Task05_FibonacciWhileLoop {
    public static void main(String[] args) {
        int n = 12; // Number of elements in the series
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        int i = 2;
        while (i < n) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }

        System.out.print("Fibonacci series: ");
        i = 0;
        while (i < n) {
            System.out.print(fibonacci[i] + " ");
            i++;
        }
        System.out.println();
    }
}

