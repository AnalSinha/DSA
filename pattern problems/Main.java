import java.util.Scanner;

public class Main {

    // Method to print the number pyramid
    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print the number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printNumberPyramid(rows);

        sc.close();
    }
}