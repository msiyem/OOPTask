package PracticeProblem03contd;

import java.util.Scanner;

public class Task01_GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int greatest = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
