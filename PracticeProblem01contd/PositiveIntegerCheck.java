package PracticeProblem01contd;

import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive integer.");
        } else {
            System.out.println(number + " is not a positive integer.");
        }
    }
}
