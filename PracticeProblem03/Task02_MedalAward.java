package PracticeProblem03;

import java.util.Scanner;

public class Task02_MedalAward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter grade: ");
        double grade = scanner.nextDouble();
        System.out.print("Has the student completed the semester? (yes/no): ");
        String completed = scanner.next();

        if (grade >= 3.5) {
            if (completed.equalsIgnoreCase("yes")) {
                System.out.println("The student is awarded a medal.");
            } else {
                System.out.println("The student has not completed the semester.");
            }
        } else {
            System.out.println("The student does not qualify for a medal.");
        }
    }
}

