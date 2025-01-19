package PracticeProblem03;

import java.util.Scanner;

public class Task01_AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        double[] values = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
            sum += values[i];
        }

        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}
