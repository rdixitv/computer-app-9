/* Program 62
Design a class to input a number and print the product of its digits excluding 0.
14/08/23 */

import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        int i = n;
        int digit;
        while (i > 0) {
            digit = i % 10;
            prod *= digit == 0 ? 1 : digit;
            i /= 10;
        }
        System.out.println("The product of the digits of " + n + " is " + prod);
    }
}