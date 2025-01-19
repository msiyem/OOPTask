package PracticeProblem03contd;

public class Task05_FibonacciDoWhileLoop {
    public static void main(String[] args) {
        int n = 12; // Number of elements in the series
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < n);

        System.out.print("Fibonacci series: ");
        i = 0;
        do {
            System.out.print(fibonacci[i] + " ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
