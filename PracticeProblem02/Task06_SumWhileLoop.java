package PracticeProblem02;

public class Task06_SumWhileLoop {
    public static void main(String[] args) {
        int sum1 = 0;
        int i = 2;
        while (i <= 20) {
            sum1 += i;
            i += 2;
        }
        System.out.println("Sum of Series 1: " + sum1);

        int sum2 = 0;
        i = 1;
        while (i <= 19) {
            sum2 += i;
            i += 2;
        }
        System.out.println("Sum of Series 2: " + sum2);
    }
}

