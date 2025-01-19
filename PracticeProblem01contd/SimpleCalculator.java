package PracticeProblem01contd;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scan.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scan.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        int result;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("The result is: " + result);
    }
}

