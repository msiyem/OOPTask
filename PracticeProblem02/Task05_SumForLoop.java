package PracticeProblem02;

public class Task05_SumForLoop {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 2; i <= 20; i += 2) {
            sum1 += i;
        }
        System.out.println("Sum of Series 1: " + sum1);

        int sum2 = 0;
        for (int i = 1; i <= 19; i += 2) {
            sum2 += i;
        }
        System.out.println("Sum of Series 2: " + sum2);
    }
}
