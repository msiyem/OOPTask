package PracticeProblem02;

public class Task04_SeriesDoWhileLoop {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Series 1: ");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();

        i = 1;
        System.out.print("Series 2: ");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 19);
        System.out.println();
    }
}
