import java.util.Scanner;

public class PalindromeNumberPyramid{

    // Method to print palindromic number pyramid
    public static void printPalindromePyramid(int rows) {

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printPalindromePyramid(rows);

        sc.close();
    }
}