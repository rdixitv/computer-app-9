/* Program 45
Design a class to input a number and print the product of its digits excluding 0.
31/07/23 */

import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        for (; n > 0; n /= 10) {
            if (n % 10 != 0)
                prod *= n % 10;
        }
        System.out.println("The product of the digits is " + prod);
    }
}