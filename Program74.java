/* Program 74
Design a class to print the product of the first n even numbers.
21/07/23 */

import java.util.Scanner;

public class Program74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        long prod = 1;
        do {
            prod *= i++ * 2;
        } while (i <= n);
        System.out.println("The product of the first " + n + " even numbers is " + prod); 
    }
}