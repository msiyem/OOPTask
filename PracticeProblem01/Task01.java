package PracticeProblem01;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float pi = 3.1416F;

            System.out.print("Enter base of the triangle: ");
            int base = scanner.nextInt();
            System.out.print("Enter height of the triangle: ");
            int height = scanner.nextInt();
            System.out.println("Area of a triangle: " + calculateTriangleArea(base, height));

            System.out.print("Enter radius of the circle/ball: ");
            int radius = scanner.nextInt();
            System.out.println("Volume of a ball: " + calculateVolumeOfBall(pi, radius));
            System.out.println("Area of a circle: " + calculateCircle(pi, radius));

            System.out.print("Enter temperature in Celsius: ");
            float celsius = scanner.nextFloat();
            System.out.println("Convert Celsius scale to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

            System.out.print("Enter arm length of the equilateral triangle: ");
            int arm = scanner.nextInt();
            System.out.println("Area of an equilateral triangle: " + calculateEquilateralTriangle(arm));

            System.out.print("Enter side a of the triangle: ");
            int a = scanner.nextInt();
            System.out.print("Enter side b of the triangle: ");
            int b = scanner.nextInt();
            System.out.print("Enter side c of the triangle: ");
            int c = scanner.nextInt();
            System.out.println("Area of a triangle (using sides): " + calculateTriangle2(a, b, c));

            scanner.close();
        }

        public static double calculateTriangleArea(int base, int height) {
            return 0.5 * base * height;
        }

        public static double calculateVolumeOfBall(float pi, int radius) {
            return (4.0 / 3.0) * pi * (radius * radius * radius);
        }

        public static double calculateCircle(float pi, int radius) {
            return pi * radius * radius;
        }

        public static double convertCelsiusToFahrenheit(float celsius) {
            return 32 + (celsius * 9 / 5);
        }

        public static double calculateEquilateralTriangle(int arm) {
            return (sqrt(3) / 4) * arm * arm;
        }

        public static double calculateTriangle2(int a, int b, int c) {
            double s = (a + b + c) / 2.0;
            return sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
