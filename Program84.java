/* Write a menu driven program to print the following series:
a. 1, 4, 9, 16, 25, ... up to 10 terms
b. 0, 1, 1, 2, 3, 5, 8, 13, ... n terms
08/09/23 */

import java.util.Scanner;

public class Program84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\na. 1, 4, 9, ...\nb. 0, 1, 1, 2, ...");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case 'a':
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i * i + ", ");
                }
                System.out.println("\b\b ");
                break;
            case 'b':
                System.out.print("Enter number of terms: ");
                int n = sc.nextInt();
                int a = 0, b = 1;
                System.out.print(a + ", " + b);
                for (int i = 1; i <= n - 2; i++) {
                    int c = a + b;
                    System.out.print(", " + c);
                    a = b;
                    b = c;
                }
                System.out.println();
                break;
            default:
                System.out.println("Invalid input: " + choice);
        }
    }
}