/* Program 40
Design a class to print the product of the first n even numbers.
24/07/23 */

import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long prod = 1;
        System.out.print("Enter the number of even numbers to find the product of: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            prod *= i * 2;

        System.out.println("The product of the first " + n + " even numbers is " + prod);
    }
}