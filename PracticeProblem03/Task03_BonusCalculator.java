package PracticeProblem03;

import java.util.Scanner;

public class Task03_BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage of target sales reached: ");
        int sales = scanner.nextInt();
        System.out.print("Enter the attendance percentage: ");
        int attendance = scanner.nextInt();
        int bonus;

        if (sales >= 95) {
            if (attendance == 100) {
                bonus = 60;
            } else if (attendance >= 90) {
                bonus = 40;
            } else {
                bonus = 5;
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                bonus = 40;
            } else if (attendance >= 90) {
                bonus = 20;
            } else {
                bonus = 5;
            }
        } else {
            bonus = 5;
        }

        System.out.println("The bonus is: " + bonus + "%");
    }
}

